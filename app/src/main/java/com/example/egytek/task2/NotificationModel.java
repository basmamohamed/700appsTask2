package com.example.egytek.task2;

public class NotificationModel {
        public String notificationDate;
        public String notificationMsg;
        public NotificationModel (){

        }
        public NotificationModel (String date , String msg){
            notificationDate = date;
            notificationMsg = msg;
        }

        public String getNotificationDate() {
            return notificationDate;
        }
        public void setNotificationDate(String mNotificationDate) {
            this.notificationDate = mNotificationDate;
    }
        public String getNotificationMsg() {
            return notificationMsg;
        }
        public void setNotificationMsg(String mNotificationMSG) {
            this.notificationMsg = mNotificationMSG;
    }
    }
