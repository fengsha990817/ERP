import axios from "axios";
import {ElMessage} from "element-plus";

const service = axios.create({
    baseURL: 'http://localhost', // api的base_url
    timeout: 5000, // 请求超时时间
    withCredentials: true
})

const defaultError = ()=> ElMessage.error('发生了错误，请联系管理员')
const defaultFailure = (message)=> ElMessage.warning(message)

function post(url, data, success, failure = defaultFailure, error = defaultError, csrf){
    service.post(url, data, {
        headers: {
            'Content-Type': "application/x-www-form-urlencoded",
            'X-CSRF-TOKEN': csrf
        },
        withCredentials: true
    }).then(({data})=>{
        if(data.success){
            success(data.message, data.status)
        }else {
            failure(data.message, data.status)
        }
    }).catch(error)
}
function get(url, success, failure = defaultFailure, error = defaultError){
    service.get(url, {
        withCredentials: true
    }).then(({data, headers})=>{
        if(data.success){
            success(data.message, data.status)
        }else {
            failure(data.message, data.status)
        }
    }).catch(error)
}
export {
    get, post, service
}