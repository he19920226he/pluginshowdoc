# idea showdoc插件
### 安装
1. 下载Releases中的jar文件。
2. setting->Plugins->Install from Disk...
3. 选择刚刚下载的jar文件。

### 配置方式
1. 在setting->tools->showDocConfig中配置。
2. 第一次使用时，会弹窗提示输入配置。
3. 修改配置可以在.idea目录下的workspace.xml中的ShowDocConfig修改配置

### 使用方式
1. 选中要上传接口的文件，右键。点击showDoc菜单，会上传单个文件的接口
2. 在编辑器里面右键也会上传当前文件的接口
3. 选中controller文件夹，会上传当前文件夹下所有文件的接口

### 注释模板
- 在PHP文件中输入showdoc后tab键就可以了
