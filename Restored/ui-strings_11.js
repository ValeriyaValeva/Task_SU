/*************************************************************************
* ADOBE CONFIDENTIAL
* ___________________
*
*  Copyright 2018 Adobe Systems Incorporated
*  All Rights Reserved.
*
* NOTICE:  All information contained herein is, and remains
* the property of Adobe Systems Incorporated and its suppliers,
* if any.  The intellectual and technical concepts contained
* herein are proprietary to Adobe Systems Incorporated and its
* suppliers and are protected by all applicable intellectual property laws,
* including trade secret and or copyright laws.
* Dissemination of this information or reproduction of this material
* is strictly forbidden unless prior written permission is obtained
* from Adobe Systems Incorporated.
**************************************************************************/

define({REQUESTS:"要求",NOTIFICATIONS:"通知",NO_NOTIFICATIONS:"沒有通知",SHOW_MORE:"顯示更多",MARKUP_ADDED:"已新增標註",NO_NOTIFICATIONS_HEADING:"您的通知會顯示在這裡。",NO_NOTIFICATIONS_SUBHEADING:"您將取得供檢視、審核和簽署共用檔案的更新。",UNREAD_NOTIFICATION:"<%= count %> 則未讀通知",UNREAD_NOTIFICATIONS:"<%= count %> 則未讀通知",SIGN:"簽署",APPROVE:"批准",FILL:"填寫",FILL_FORM:"填寫表格",ACKNOWLEDGE:"確認",DELEGATE:"委派",CLOSE:"關閉",ACCEPT:"接受",VIEW:"檢視",REVIEW:"審核",OPEN:"開啟",VIEW_SIGN:"檢視並簽署",VIEW_APPROVE:"檢視並批准",VIEW_FILL:"檢視並填寫表格",VIEW_ACKNOWLEDGE:"檢視並確認",VIEW_DELEGATE:"檢視並委派",VIEW_ACCEPT:"檢視並接受",SIGNED:"已簽署",E_SIGNED:"已電子簽署",APPROVED:"已批准",FILLED:"填充",ACKNOWLEDGED:"已確認",DELEGATED:"已委派",ACCEPTED:"已接受",VIEW_SIGN_LABEL:"檢視並簽署此合約",VIEW_APRROVE_LABEL:"檢視並審批此合約",VIEW_DELEGATE_LABEL:"檢視並委派此合約",VIEW_ACKNOWLEDGE_LABEL:"檢視並認可此合約",VIEW_ACCEPT_LABEL:"檢視並接受此合約",VIEW_FILL_FORM_LABEL:"檢視並填寫此合約",SIGN_DOC_RECEIVED:"<b><%= sender %></b> 已共用文件供您<%= action %>",SIGN_EMAIL_VIEWED:"<b><%= document %></b> 的電子郵件已由 <b><%= signer %></b> 開啟",SIGN_DOC_SIGNED:"<b><%= document %></b> 已由 <b><%= signer %></b> <%= action %>",SIGN_EXPIRED_SENDER_ONE_SIGNER:"等候 <b><%= signer %></b> 的 <b><%= document %></b> 截止日期已於 <%= deadline %> 到期",SIGN_EXPIRED_SENDER_MANY_SIGNERS:"等候 <b><%= signer %></b> 和其他人的 <%= document %> 截止時間已於 <%= deadline %> 到期",SIGN_EXPIRED_SIGNER:"<%= action %>來自 <b><%= sender %></b> 的 <b><%= document %></b> 截止日期已過期",SIGN_EMAIL_BOUNCED:"傳送給 <b><%= signer %></b> 以<%= action %> <b><%= document %></b> 的電子郵件遭退回。請檢查電子郵件地址。",SIGN_CANCELLED_SIGNER:"<b><%= sender %></b> 已取消 <b><%= document %></b>",SIGN_REMINDER_SIGNER:"提醒: <b><%= sender %></b> 正在等候您<%= action %> <b><%= document %></b>",SIGN_REMINDER_DEADLINE_SIGNER:"提醒: <b><%= sender %></b> 正在等候您在 <%= deadline %> 之前<%= action %> <b><%= document %></b>",SIGN_DOC_DECLINED:"<b><%= document %></b> 已由 <b><%= signer %></b> 拒絕",SIGN_DELEGATE:"<b><%= document %></b> 已由 <b><%= delegator %></b> 委派給 <b><%= delegatee %></b>",FILL_SIGN_DOC_RECEIVED:"<b><%= signer %></b> 已填寫、電子簽署並傳送 <%= document %> 給您",FILL_SIGN_DOC_OPENED:"<%= document %> 的電子郵件已由 <b><%= signer %></b> 開啟","S&T_DOC_RECEIVED":"<%= sender %> 已與您共用 <%= document %> 的副本","S&T_DOC_OPENED":"<%= document %> 已由 <%= recipient %> 開啟並檢視","S&T_DOC_DOWNLOADED":"<%= document %> 已由 <%= recipient %> 下載",EUREKA_DOC_RECEIVED:"<b><%= sender %></b> 已共用文件供您審核，到期時間為 <%= date %> <%= time %>",EUREKA_DOC_RECEIVED_NO_DEADLINE:"<b><%= sender %></b> 已共用文件供您審核",FEW_SECONDS_AGO:"幾秒鐘前",ONE_MINUTE_AGO:"1 分鐘前",N_MINUTES_AGO:"<%= n %> 分鐘前",ONE_HOUR_AGO:"1 小時前",N_HOURS_AGO:"<%= n %> 小時前",ONE_DAY_AGO:"1 天前",N_DAYS_AGO:"<%= n %> 天前",DUE_DATE:"到期日: <%= date %>",PRESS_ENTER_SPACE:"按空格鍵或 ENTER 鍵或以開啟文件。"});