package GitGithub;

public class GitHub_Kullanimi_Notlar {
            /*

         3 tip Versiyon Kontrol Sistemi vardır.   version Conrol System---->projeye her yeni bir sey ekledıgımde uzak masaustune gonderme update etme vs..
                                                                        var olan bir projenin yedeklediğim her bir adımı diyebiliriz

         git----->kişisel bilgisayarımdaki calısmalarımı github denene depolama alanına yukeleyen baglantı kurmamı saglayan program arayüz
         git---->git is a high quality version control system
         github----->github is a cloud-based hosting service

         yerel vcs-----> sadece kendi bilgisayarında
         merkezi  vcs----->  bilgisayarların tekil olarak bi sisteme baglanması
         dagıtık  vcs---->  Distrubuted Version Control System     local--->git--->github     bizim kullanıcagımız bu sistemdir.birden fazla kişinin kullanabilecegi sistem
                                                                       bilgisayarlar hem bşr merkeze ve hemde bu merkez uzerınden birbirlerine baglanabilir

         PS C:\GitGithub> git --version          git versiyonunu gormek icin

         PS C:\GitGithub> git config --global -l         git deki hesap vs ayarları görmek icin
                                                               Yapılan commit(versiyon demek) leri burada belirtilen isim ve eposta ile ilişkilendirir. Repo
                                                             da çalışan diğer kişiler bu isim ve  epostayı görür.

         PS C:\GitGithub> git config --global color.ui true               Terminal de komutların renklendirilmesini sağlar

         global, sistem veya local ---------->      • System parametresi kullanıldığında tüm kullanıcılar ve tüm repolar üzerinde etkiliolur----->bazen command terminali calısmazsa yonetıcı olarak calıstır dıyebılırsın
                                                         • Global parametresi geçerli kullanıcının tüm repolar üzerinde etkili olur
                                                           • Local parametresi ise sadece geçerli repo üzerinde etkili olur


        git init ------->                            Local bilgisayarımızda bir projeyi versiyon sistemine alabilmek için git init komutu
                                                            kullanılır. Bu komut kullanılınca proje klasöründe .git klasörü oluşturulur. Bu, local repomuzu saklayacaktır.


        PS C:\GitGithub> git init
                Initialized empty Git repository in C:/GitGithub/.git/       ---bos bir repositery olustu

        Working Space-------->.git klasörünün bulunduğu çalışma alanıdır. Klasörler ve dosyalar üzerinden değişiklik burada yapılır.
                                yani biligisayarda yani yerelde yaptıgın tum calısmalar working space olur.class uzerinde yazdıgın kodlar acılan yeni sınıflar vs...

        Staging Area------------>   Versiyon oluşturulacak olan dosya veya klasörlerin geçici olarak toplandığı yerdir. Versiyon (commit) oluşturulduktan
                                    sonra otomatik olarak staging area boşaltılır-----burada git add . komutuyla gonderilecek dosyaları bi yerde toplarız.

         Commit Store----------->    Git her bir commit i ayrı bir versiyon olarak tutar. Böylece yapılan çeşitli değişikliklerden sonra projede sorunlar ortaya
                                     çıkarsa bir önceki commit e geri dönülebilir.------buradada git commit -m "yeni versiyon "    yazıp versiyonumuzu gonderiyoruz

        git status------->var olan yeni veye yuklenmis dosyaların tamamını gosterir


        git commit -m "buraya genelde tarih atılır"  ------- olusturdugumuz versiyon gonderilmek uzere hazırlanır



        git log -----> daha onceden gondermıs oldugun versıyonların kayıtlarını tarihleriyle birlikte detaylı uzun bir sekilde sana getırır



        git log --oneline   ------>  daha onceden gondermıs oldugun versıyonların kayıtlarını ozet olarak sana getırır


        ----> EGER Bİ DEGISIKLIK YAPTIGIMIZDA GİT ADD . KULLANMAZSAK GİT STATUS YAZDIGIMIZDA KAYDEDILMEYENLER KIRMIZI OLARAK CIKAR
        NE ZAMANKİ GİT ADD . KOMUTU VERİR VE SONRASINDA STATUS UNE BAKARSAK O ZAMAN YESILE DONECEK YANI ISLEM TAMAMLANMIS OLACAKTIR
        YESIL KOD COMMIT LEMEYE HAZIR OLDUGUNU SOYLER


        --------Komutlar
        git --version


        git config --global user.email "email_adresiniz"    ----->   Yapılan commit leri burada belirtilen isim ve eposta ile ilişkilendirir. Repo da çalışan diğer kişiler bu isim ve
                                                                epostayı görür.
        git config --global user.name "isminiz"


        git config --global -l --> Ayarları listeler


        git config --global color.ui true    ----->Terminal de komutların  renklendirilmesini sağlar

        git init --> git ile ilişkilendirir

        git status --> Working Space ve Staged deki değişiklikleri gösterir

        git add . --> Working'den staging area'ya gönderir



        git diff --> Working space deki değişikliği gösterir


        git diff --staged --> Staging Area daki değişiklikleri gösterir


        git commit -m "first commit"


        git show "hashcode" --> Versiyondaki değişiklikleri gösterirGİ

        git log --oneline


        git restore .    --->BUNU YAPARSAK EN SON VERSİYONDAN SONRA NELER YAPILMISSA YAPILMIS HEPSI IPTAL OLUR SILINIR

        git restore --staged .       ----->commit ettiklerimizi iptal eder


        git reset --hard         Working space deki değişiklikleri iptal eder, staging area yı boşaltır.




          1- git init -->   local repo olusturmak ıcın kullanılır yani .git klasorumuzun ıcındeki dosyaları iliskilendirmek icin kullanılır.

            2- git add . -->   working spaceden yani yerelden dosyalarımızı staging area ya yani commitlemek icin beklenen yere gonderir.

            3- git commit -m "version ısmı"   --> staging areadan commit store dosyaları gondermek ıcın kullanılır.commit yanı versıyon yada diger adıyla surum
                                                  olusturmak ıcın kullanırım.

            4- git push --->  uzak repoya yani remote github a gondermek icin kullandıgımız kod yalnız git push komutunu direk kullanmak istersek
                              bir kereliğine

                              git branch -M main    yazıyoruz

                              git remote add origin ...buraya githubdaki reponun adresını yazıyoruz.....     --> bu sadece bir kere kullanılır ve sonra tekrar bir kereliğine

                              git push -u origin main(branch ismi yani)      ---> komut sadece bir kere kullanılır

                                                               NOT:  yukarıdaki iki komutu sadece bir kere kullandıktan sonra degısıklıklerı gondermek ıcın sadece git push yazsak yeterlı oluyor

            5- git log --oneline --> coomitlerdeki yani versiyonlardaki durumu gosterir

            6- git commit -a -m "versiyon ismi "   --> yazılırsa add yapmadan direk commit yapılabilir buradaki a harfi add icin kullanıldı


            7- git pull --->            remotedaki degısıklıkleri cekmek icin kullanılır

            8- git branch --->          halihazırda kac tane branch oldugunu gormek ıcın

            9- git branch birol --->    yeni bir branch olusturur

            10- git checkout birol--->  birol branchini gecis yapar

            11- git merge birol --->    maindeyken birolda yapılan değişiklikleri maine alır


            12- clear --> kodları temizler

            13- git show  [hash kodun ilk 7 karakteri]    --->Bir versiyon içinde, hangi değişikliklerin olduğunu görmek için kullanır.

            14- cd dosy adı   --->istenilen dosyaya girer


            15-git restore .   ----> working space deki  tüm dosyaları iptal eder
               git restore dosya_adı   ---> sadece tek dosyayı iptal eder


            16- git restore --staged .  ------>   staging area da Tüm dosyaları iptal eder.working spaceden gonderilenleri iptal eder
                                                  ama working spacedekilere dokunmaz
                git restore --staged [dosya]     ---->   Tek bir dosyayı iptal eder


            17- git reset --hard    -----> Working space deki değişiklikleri iptal eder, staging area yı boşaltır.yapılan herseyı tamamen iptal eder
                                               hicbir degısıklık ortada kalmaz



            18-  git checkout [hash] [dosya]    ------>   Dosya,hash ile belirtilen versiyona döner

                 git checkout [hash] .        ------> Hash değeri verilen versiyona döner


            19-git reset --hard [hash]     ------>   Geri alınamayacak şekilde önceki versiyona dönmek.eski versiyona donup o versiyondan sonra olusturulmus
                                                     tüm versiyonlar silinirgit



            20- git branch -m [isim]      ----->  Branch ismini değiştirir.


            21-git branch –d [isim]         ----->  Branch i siler

            22-git stash       --->Working space ve staging area daki değişiklikleri geçici olarak hafızaya alır ve bu bölgeleri temizler
                                    yani commit yapmadan baska bir branch e gecmemizi saglar bunları kaydeder geri aynı branch e geldıgımızde
                                    kaldıgımız yerden devam ederiz


            23-  git stash list     ----->Hafızaya alınan  değişiklikleri görmek  için kullanılır

            24- git stash pop    ----->    Hafızaya alınan değişiklikleri geri uygulamak için kullanılır.

            25- git clone ....urlİsmi....    ----> baskasının githubdaki reposunu locali,mize clonlama islemidir

            26- cd ch*    -----> ch ile baslayan dosyaya girer

            26-git push     ----->localde olusturulan commitlerin github a gonderılmesi

            27-git pull     ----->Fetch ve Merge işlemini tek başına yapar  github dakileri locale indirir

            28- git remote -v    ----->  localdeki dosyanın hangi repoyla baglantılı oldugunu gosterir
                                         github da yapılan bi değişiklik olursa git pull ile bunları lokale cekebiliriz

            suan bu satırı hem localde hem de github da yazıcam.su an bu lokaldeki not












     */
}
