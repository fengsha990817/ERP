package com.example.backend.entity;

import java.io.Serializable;
import java.util.Date;


public class TableReturnEntity implements Serializable {
    int id;
    boolean isApproval;
    int infoState;
    String dateCreate;
    Date dateCreateTransfer;
    String dateUpdate;
    Date dateUpdateTransfer;
    int goodsType;
    int warehouseType;
    String thickness;
    String material;
    String state;
    String pageNumber;
    String productName;
    int amount;
    String amountType;
    String buyInStaff;
    String manufacture;
    String operator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isApproval() {
        return isApproval;
    }

    public void setApproval(boolean approval) {
        isApproval = approval;
    }

    public int getInfoState() {
        return infoState;
    }

    public void setInfoState(int infoState) {
        this.infoState = infoState;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateCreateTransfer() {
        return dateCreateTransfer;
    }

    public void setDateCreateTransfer(Date dateCreateTransfer) {
        this.dateCreateTransfer = dateCreateTransfer;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Date getDateUpdateTransfer() {
        return dateUpdateTransfer;
    }

    public void setDateUpdateTransfer(Date dateUpdateTransfer) {
        this.dateUpdateTransfer = dateUpdateTransfer;
    }

    public int getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(int goodsType) {
        this.goodsType = goodsType;
    }

    public int getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(int warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public String getBuyInStaff() {
        return buyInStaff;
    }

    public void setBuyInStaff(String buyInStaff) {
        this.buyInStaff = buyInStaff;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "TableReturnEntity{" +
                "id=" + id +
                ", isApproval=" + isApproval +
                ", infoState=" + infoState +
                ", dateCreate='" + dateCreate + '\'' +
                ", dateCreateTransfer=" + dateCreateTransfer +
                ", dateUpdate='" + dateUpdate + '\'' +
                ", dateUpdateTransfer=" + dateUpdateTransfer +
                ", goodsType=" + goodsType +
                ", warehouseType=" + warehouseType +
                ", thickness='" + thickness + '\'' +
                ", material='" + material + '\'' +
                ", state='" + state + '\'' +
                ", pageNumber='" + pageNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                ", amountType='" + amountType + '\'' +
                ", buyInStaff='" + buyInStaff + '\'' +
                ", manufactureStaff='" + manufacture + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
