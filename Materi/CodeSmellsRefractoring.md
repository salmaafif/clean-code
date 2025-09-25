# Code Smells and Refactoring

Karena terjadinya spaghetti code, akhirnya didirikanlah Object Oriented Principle

Untuk tahap pertama belajar 5 ini dulu:

1. Dry Principles
    
    Dont Repeat Yourself Principle. Programmer, sering daripada mengetik, memilih menduplikasi. Elemen dalam program yang mencapai 3x duplikasi, harus digantikan iterasi maupun abstraksi. Karena jika dilakukan berulang ulang, jadinya wastehttp
    
2. YAGNI Principle
    
    You are Not Gonna Need It
    Buang semua yang jelas ga dipake (eman ngehapus comment) padahal tinggal di flag di git
    
    Ada codenya yang aktif, tapi ditandai
    
    Bisa jalan tapi ga ada notifnya (lazy code =  sebuah function dari kelas lain tapi cuma dipakai 1 class tapi jarang di akses)
    
3. Kiss Principle
    
    Keep it Simple, Stupid!
    Program harus dibuat semudah mungkin dalam dipahami. Implementasinya tidak hanya di code, tapi juga di ui/ux (semakin kecil interaction cost, semakin bagus). Dicari mana value utama yang harus dicoba user. Intinya yang dibikin harus bisa dipahami orang lain
    
    ![image.png](attachment:7657bf4f-db6d-43a6-a91e-8a1d0296f751:image.png)
    
    ![image.png](attachment:7e4d4c7c-719a-4d56-b01f-2141eb6d124e:image.png)
    
    Ini lebih menerapkan KISS Principle daripada yang atas, karena bisa mengubahnya dengan effort seminimal mungkin.
    
4. Single Responsibility Principle
    
    Setiap elemen dalam program harus fokus pada satu tujuan
    
    Elemen: 
    
    1. Class
    2. Function
    3. Variable
    
    Semua harus spesifik tujuannya apa. Kadang classnya bilang apa, tapi functionnya macem macem diluar konteks
    
5. Open Close Principle
    
    Penambahan fitur harus melalui ekstensi, bukan modifikasi. Tinggal ditambah rantainya, tidak perlu mengubah data
    
    ![image.png](attachment:c7be6828-e0cd-4fab-9dc4-691d49d0671b:image.png)
    
    Disini ga jelas ngitung luas apa volume, dia melanggar SRP juga. 
    

Belajar interface atau abstract, ya intinya apa yang kamu lakuin, kamu harus paham ngapain
