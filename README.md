# convert-pdf2docx-client
using jsp-servlet to build application convert pdf to docx


# server:
https://github.com/giabao2807/convert-pdf2docx-server

The server using library pdf2docx of python to convert if status of source in database = 'false'
It must be run throughout the client execution, ensuring that the newly included files are always converted.
<br/>
<br/>
if the server is stopped, the files uploaded by the client only save the database and are not converted, the status is false.

# client:
Web dynamic for client upload file pdf and download if it converted to docx 🛠

# install:
  ✨ clone 2 repositories of client and server
<br/>
  ✨ open mysql run ltm.sql scripts
<br/>
  ✨ open db.js in repositori server to change properties of mysql 
<br/>
  ✨ open utils package >> class ConnectionProvider to change properties of mysql
<br/>
  ✨ run on server file index.jsp
<br/>
  ✨ More detail in huongdansudung.pdf and demo.mp4
 



  
