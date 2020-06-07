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

define({REQUESTS:"ЗАПИТИ",NOTIFICATIONS:"СПОВІЩЕННЯ",NO_NOTIFICATIONS:"Немає сповіщень",SHOW_MORE:"Показати більше",MARKUP_ADDED:"Додано позначку",NO_NOTIFICATIONS_HEADING:"Тут відображатимуться ваші сповіщення.",NO_NOTIFICATIONS_SUBHEADING:"Ви будете отримувати сповіщення щодо файлів, наданих у спільний доступ для перегляду, рецензування й підписання.",UNREAD_NOTIFICATION:"<%= count %> непрочитане сповіщення",UNREAD_NOTIFICATIONS:"Непрочитаних сповіщень: <%= count %>",SIGN:"Підписати",APPROVE:"Затвердити",FILL:"Заповнити",FILL_FORM:"Заповнити форму",ACKNOWLEDGE:"Визнати",DELEGATE:"Делегувати",CLOSE:"Закрити",ACCEPT:"Прийняти",VIEW:"Перегляд",REVIEW:"Рецензія",OPEN:"Відкрити",VIEW_SIGN:"Переглянути й підписати",VIEW_APPROVE:"Переглянути й затвердити",VIEW_FILL:"Переглянути й заповнити форму",VIEW_ACKNOWLEDGE:"Переглянути й підтвердити",VIEW_DELEGATE:"Переглянути й делегувати",VIEW_ACCEPT:"Переглянути й прийняти",SIGNED:"Підписано",E_SIGNED:"електронний підпис",APPROVED:"Затверджено",FILLED:"Заповнено",ACKNOWLEDGED:"Підтверджено",DELEGATED:"Делеговано",ACCEPTED:"Прийнято",VIEW_SIGN_LABEL:"Переглянути й підписати цю угоду",VIEW_APRROVE_LABEL:"Переглянути й затвердити цю угоду",VIEW_DELEGATE_LABEL:"Переглянути й делегувати цю угоду",VIEW_ACKNOWLEDGE_LABEL:"Переглянути й визнати цю угоду",VIEW_ACCEPT_LABEL:"Переглянути й прийняти цю угоду",VIEW_FILL_FORM_LABEL:"Переглянути й заповнити цю угоду",SIGN_DOC_RECEIVED:"Користувач <b><%= sender %></b> надав вам доступ до документа для <%= action %>",SIGN_EMAIL_VIEWED:"Повідомлення електронної пошти щодо документа <b><%= document %></b> відкрито користувачем <b><%= signer %></b>",SIGN_DOC_SIGNED:"Користувач <b><%= signer %></b> <%= action %> документ <b><%= document %></b>",SIGN_EXPIRED_SENDER_ONE_SIGNER:"Крайній термін, установлений для користувача <b><%= signer %></b> щодо документа <b><%= document %></b>, минув <%= deadline %>",SIGN_EXPIRED_SENDER_MANY_SIGNERS:"Крайній строк для документа <%= document %>, який було встановлено для користувача <b><%= signer %></b> та інших, минув <%= deadline %>",SIGN_EXPIRED_SIGNER:"Крайній термін, установлений для <%= action %> вами документа <b><%= document %></b>, отриманого від користувача <b><%= sender %></b>, минув",SIGN_EMAIL_BOUNCED:"Повідомлення електронної пошти користувачеві <b><%= signer %></b> щодо <%= action %> документа <b><%= document %></b> не доставлено. Перевірте адресу електронної пошти.",SIGN_CANCELLED_SIGNER:"Користувач <b><%= sender %></b> скасував документ <b><%= document %></b>",SIGN_REMINDER_SIGNER:"Нагадування: користувач <b><%= sender %></b> очікує на <%= action %> вами документа <b><%= document %></b>",SIGN_REMINDER_DEADLINE_SIGNER:"Нагадування: користувач <b><%= sender %></b> очікує на <%= action %> вами документа <b><%= document %></b> до <%= deadline %>",SIGN_DOC_DECLINED:"Документ <b><%= document %></b> відхилено користувачем <b><%= signer %></b>",SIGN_DELEGATE:"Документ <b><%= document %></b> делеговано користувачем <b><%= delegator %></b> користувачу <b><%= delegatee %></b>",FILL_SIGN_DOC_RECEIVED:"Користувач <b><%= signer %></b> заповнив, підписав електронним підписом і надіслав вам документ <%= document %>",FILL_SIGN_DOC_OPENED:"Користувач <b><%= signer %></b> відкрив електронне повідомлення щодо документа <%= document %>","S&T_DOC_RECEIVED":"Користувач <%= sender %> надав вам доступ до копії документа <%= document %>","S&T_DOC_OPENED":"Документ <%= document %> було відкрито й переглянуто користувачем <%= recipient %>","S&T_DOC_DOWNLOADED":"Документ <%= document %> завантажений користувачем <%= recipient %>",EUREKA_DOC_RECEIVED:"Користувач <b><%= sender %></b> надав вам доступ до документа для рецензування до <%= time > <%= date %>",EUREKA_DOC_RECEIVED_NO_DEADLINE:"Користувач <b><%= sender %></b> надав вам доступ до документа для рецензування",FEW_SECONDS_AGO:"Кілька секунд тому",ONE_MINUTE_AGO:"1 хвилину тому",N_MINUTES_AGO:"<%= n %> хв тому",ONE_HOUR_AGO:"1 годину тому",N_HOURS_AGO:"<%= n %> год. тому",ONE_DAY_AGO:"1 день тому",N_DAYS_AGO:"<%= n %> дн. тому",DUE_DATE:"До <%= date %>",PRESS_ENTER_SPACE:"Щоб відкрити документ, натисніть пробіл або Enter."});