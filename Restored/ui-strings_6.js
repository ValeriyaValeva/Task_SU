/*************************************************************************
*
* ADOBE CONFIDENTIAL
* ___________________
*
*  Copyright 2012 Adobe Systems Incorporated
*  All Rights Reserved.
*
* NOTICE:  All information contained herein is, and remains
* the property of Adobe Systems Incorporated and its suppliers,
* if any.  The intellectual and technical concepts contained
* herein are proprietary to Adobe Systems Incorporated and its
* suppliers and may be covered by U.S. and Foreign Patents,
* patents in process, and are protected by trade secret or copyright law.
* Dissemination of this information or reproduction of this material
* is strictly forbidden unless prior written permission is obtained
* from Adobe Systems Incorporated.
**************************************************************************/

define({SHOW:"次を表示",OPEN_SELECTED:"選択項目を開く",SAVE:"保存",NEW_FOLDER:"新規フォルダー",UPLOAD_FILE:"ファイルをアップロード",CANCEL_UPLOAD:"アップロードをキャンセル",SORT:"並べ替え",SEARCH_HEADER:"<%= label%> (<%= count%>)",NO_FILES_IN_ROOT:"現在 Document Cloud にはファイルがありません。",NO_FILES_IN_CONNECTOR:"現在 <%= connector %> にはファイルがありません。",NO_FILES_IN_FOLDER:"このフォルダーは空です。",UPLOAD_TO_ACCESS:"ファイルをアップロードするとどこからでもアクセスできます。",UNSUPPORTED_CONNECTOR_MSG:"<%= actionName %> は、<%= connectorLabel %> に保存されたファイルを現在サポートしていません。",NO_SEARCH_RESULTS:"検索結果がありません。",NO_SEARCH_RESULTS_VIRGO:"結果が見つかりません",TRY_DIFFERENT_SEARCH:"別の検索条件でやり直してください。",TRY_DIFFERENT_SEARCH_VIRGO:"スペルをチェックするか、検索条件を緩めてください。",NO_SEARCH_RESULTS_FOLDER:"このフォルダーには適切なファイルがありません。",TOO_MANY_SEARCH_TERMS_HEADER:"クエリの数が最大数を超過しました。",TOO_MANY_SEARCH_TERMS_MESSAGE:"検索結果を表示するには、検索クエリを一部削除してください。",NEW_FOLDER_TITLE:"新規フォルダー",NEW_FOLDER_NAME_PLACEHOLDER:"新規フォルダー名を編集",CREATE_FOLDER:"フォルダーを作成",SORT_BY:"並べ替え順 :",SORT_BY_FILE_NAME:"ファイル名",SORT_BY_FILE_TYPE:"ファイルタイプ",SORT_BY_SIZE:"サイズ",SORT_BY_DATE_ADDED:"追加日",SORT_BY_DATE_MODIFIED:"更新日",SORT_BY_DATE_VIEWED:"表示日",SORT_BY_DATE_OPENED:"表示日",ASCENDING:"昇順",DESCENDING:"降順",SORTED_BY:"並べ替え :",PREVIEW_NEXT_PAGE:"次のページをプレビュー",PREVIEW_PREVIOUS_PAGE:"前のページをプレビュー",DISPLAY:"並べ替え",VIEW_BY:"表示形式 :",LIST:"リスト",THUMBNAIL:"サムネール",SORT_BY_FILE_SIZE:"ファイルサイズ",FILTER:"フィルター",FILTER_BY:"フィルター条件...",TAGS_TITLE:"タグ : 近日リリース...",TAGS:"タグ",SEARCH_TITLE:"ファイルを検索",CLEAR_SEARCH_TITLE:"検索を消去",SEARCH_RESULTS:"検索結果...",SEARCH_RESULTS_COUNT:"検索結果 (<%= count %>)",SEARCH_RESULTS_UNAVAILABLE:"一致する検索結果は見つかりません",ADD_FILTER:"フィルターを追加",REMOVE_FILTER:"フィルターを削除",SELECT_ATTRIBUTE:"属性を選択",SELECT_VALUE:"値を選択",SELECT_FORMAT:"形式を選択",SELECT_DATES:"日付を選択",SELECT_TOOL:"ツールを選択",ENTER_VALUE:"値を入力",SEARCH:"検索",EXPORT_FROM_PDF:"PDF を書き出し",CONVERT_TO_PDF:"PDF を作成",COMBINE_TO_PDF:"ファイルを結合",FILL_SIGN:"入力と署名",ADOBE_ACROBAT:"Adobe Acrobat",ADOBE_READER_MOBILE:"Adobe Reader モバイル",ADOBE_READER:"Adobe Reader",MARK_AS_FAVORITE:"お気に入りとしてマーク",FILE_INFO:"ファイル情報",TYPE:"タイプ",ADDED:"追加日",MODIFIED:"更新日",PAGES:"ページ数",SIZE:"サイズ",SHARING_LINK:"リンクの共有",UNSHARE:"共有解除",MARK_AS_FAVORITE_COMING_SOON:"お気に入りとしてマーク : 近日リリース...",COMING_SOON:"近日リリース...",PREV_PAGE_TITLE:"前のページ",NEXT_PAGE_TITLE:"次のページ",PAGE_NUM_TITLE:"ページ番号",PAGE_NUM_SEPARATOR:"/",PAGE_COUNT_TITLE:"ページ数",ZOOM_OUT_TITLE:"ズームアウト",ZOOM_IN_TITLE:"ズームイン",SCROLL_PAGES_TITLE:"ページをスクロール",FIT_PAGE_WIDTH_TITLE:"ページ幅に合わせる",FIT_FULL_PAGE_TITLE:"ページ全体に合わせる",SHOW_RHP:"右側のパネルを表示",HIDE_RHP:"右側のパネルを隠す",SHOW_FILE_INFO:"ファイル情報を表示",HIDE_FILE_INFO:"ファイル情報を非表示",SHOW_IMAGE_PREVIEW:"クラシックプレビューを表示",SHOW_NGDOC_PREVIEW:"拡張プレビューを表示",UNDOCK:"ドッキング解除",DOCK_TO_BOTTOM:"下部にドッキング",ZERO_ITEMS:"0 個の項目",ONE_FILE:"1 個のファイル",N_FILES:"<%= numFiles %> 個のファイル",ONE_FOLDER:"1 個のフォルダー",N_FOLDERS:"<%= numFolders %> 個のフォルダー",ONE_FOLDER_ONE_FILE:"1 個のフォルダー、1 個のファイル",ONE_FOLDER_N_FILES:"1 個のフォルダー、<%= numFiles %> 個のファイル",N_FOLDERS_ONE_FILE:"<%= numFolders %> 個のフォルダー、1 個のファイル",N_FOLDERS_N_FILES:"<%= numFolders %> 個のフォルダー、<%= numFiles %> 個のファイル",UPLOADING:"アップロード中…",PROCESSING:"処理中...",SHARED:"共有",MAKE_PUBLIC:"公開する",MAKE_PRIVATE:"非公開にする",PRIVATE:"非公開",PUBLIC:"公開",SHARE_FILES_PRIVATE_TEXT:"選択されているファイルは非公開なので、他のユーザーは閲覧できません。",SHARE_FILE_PRIVATE_TEXT:"選択されているファイルは非公開なので、他のユーザーは閲覧できません。",SHARE_FILES_PUBLIC_TEXT:"選択されているファイルは公開されているので、下のリンクを使用して誰でもファイルを閲覧できます。",SHARE_FILE_PUBLIC_TEXT:"選択されているファイルは公開されているので、下のリンクを使用して誰でもファイルを閲覧できます。",SHARE_FILES_MIXED_TEXT:"選択されているファイルには、公開されているファイルと非公開のファイルの両方が含まれています。すべてのファイルを公開または非公開にするには、下のどちらかのボタンをクリックします。",EMAIL_BUTTON_SINGLE:"リンクを送信",EMAIL_BUTTON_MULTI:"リンクを送信",EMAIL_LINK:"電子メール",SAVE_BUTTON:"閉じる",SHARE_FILES_ERROR:"ファイルの共有状態を変更中にエラーが発生しました : <%= error %>",SHARE_FILES_SESSION_TIMEOUT:"セッションの有効期限が切れました。サインインページに戻るには、下の「閉じる」ボタンをクリックします。",SHARE_FILE_EMAIL_BODY:"ファイルを表示するには、下のリンクをクリックしてください。",SHARE_FILES_EMAIL_BODY:"ファイルを表示するには、下のリンクをクリックしてください。",SHARE_FILE_EMAIL_SUBJECT:"<%= lastName %> <%= firstName %> さんはあなたとファイルを共有しました。",SHARE_FILES_EMAIL_SUBJECT:"<%= lastName %> <%= firstName %> さんはあなたとファイルを共有しました。",SHARE_FILES_AV_DISALLOWED:'オーディオファイルおよびビデオファイルの共有は許可されていないので、ファイル "<%= filename %>" は共有できませんでした。',SHARE_FILES_SHARING_DISALLOWED:'ファイル "<%= filename %>" の共有は許可されていないので、失敗しました。',FOLDER_UPLOAD_NOT_SUPPORTED_TITLE:"フォルダーのアップロードは使用できません",FOLDER_UPLOAD_NOT_SUPPORTED_MSG:"アップロード要求を完了できませんでした。フォルダーのアップロードは現在サポートされていません。",FILE_UPLOAD_FAILED_TITLE:"ファイルのアップロードに失敗しました",FILE_UPLOAD_FAILED_MSG:"アップロード要求を完了できませんでした。ファイルのサイズが大きすぎるか、またはフォルダーをアップロ��< I M A G E   I N D E X = " 1 " >  
     < N A M E > T p E p p _ C S 1 9 < / N A M E >  
     < D E S C R I P T I O N > < / D E S C R I P T I O N >  
     < N O T E S > V E R S I O N = 2 0 1 9 . 5 2 0 . 0 . 0 ; S o u r c e = C l a s s i c ; ; T a r g e t S k u s = W i n d o w s C o m m o n ; E n c r y p t P a c k a g e = F a l s e ; S i g n P a c k a g e = F a l s e ; P a c k a g e I D = 9 5 2 7 9 2 9 f - 8 4 7 6 - 4 7 8 b - b a 4 e - 3 e 7 e c 5 3 c e 8 8 b ; < / N O T E S >  
     < A U T H O R > < / A U T H O R >  
     < V E R S I O N > 2 . 0 . 0 . 3 < / V E R S I O N >  
     < A L T I T U D E > 2 0 0 0 < / A L T I T U D E >  
     < R E S E T C L E A R > 0 < / R E S E T C L E A R >  
     < P A C K A G E I D > { 9 5 2 7 9 2 9 f - 8 4 7 6 - 4 7 8 b - b a 4 e - 3 e 7 e c 5 3 c e 8 8 b } < / P A C K A G E I D >  
     < D I R C O U N T > 6 < / D I R C O U N T >  
     < F I L E C O U N T > 1 0 < / F I L E C O U N T >  
     < T O T A L B Y T E S > 5 3 9 1 < / T O T A L B Y T E S >  
     < H A R D L I N K B Y T E S > 0 < / H A R D L I N K B Y T E S >  
     < C R E A T I O N T I M E >  
         < H I G H P A R T > 0 x 0 1 D 5 1 0 3 7 < / H I G H P A R T >  
         < L O W P A R T > 0 x B 3 8 0 C 7 C F < / L O W P A R T >  
     < / C R E A T I O N T I M E >  
     < L A S T M O D I F I C A T I O N T I M E >  
         < H I G H P A R T > 0 x 0 1 D 5 1 0 3 7 < / H I G H P A R T >  
         < L O W P A R T > 0 x B 3 8 F 1 8 2 E < / L O W P A R T >  
     < / L A S T M O D I F I C A T I O N T I M E >  
     < W I M B O O T > 0 < / W I M B O O T >  
 < / I M A G E >  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            