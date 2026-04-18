o-Do Uygulaması (Spring Boot + Docker + Kubernetes + CI/CD)

Bu proje, Spring Boot ile geliştirilen bir To-Do List API’nin Docker ile containerize edilmesi, Kubernetes (Kind) üzerinde çalıştırılması ve GitHub Actions ile CI/CD sürecinin otomatikleştirilmesini kapsamaktadır.

Projenin amacı, bir backend uygulamasının geliştirilmesinden başlayarak veritabanı entegrasyonu, containerization (Docker), Kubernetes deployment ve CI/CD otomasyonu süreçlerini uçtan uca öğrenmek ve uygulamaktır.

Kullanılan teknolojiler:
- Java 17
- Spring Boot
- Spring Data JPA / Hibernate
- PostgreSQL
- Docker
- Docker Compose
- Kubernetes
- Kind (Kubernetes in Docker)
- Git ve GitHub
- GitHub Actions (CI/CD)

Özellikler:
- Görev ekleme
- Tüm görevleri listeleme
- Görev güncelleme
- Görev silme

API endpointleri:

Tüm görevleri getir:
GET /tasks

Yeni görev ekle:
POST /tasks

Örnek JSON:
{
  "title": "ilk görev"
}

Docker kullanımı:

docker build -t todoapp-app:latest .

Kubernetes:

Uygulama ve PostgreSQL veritabanı lokal Kubernetes cluster (Kind) üzerinde çalıştırılmıştır.

Kullanılan dosyalar:
- app-deployment.yaml
- app-service.yaml
- postgres-deployment.yaml
- postgres-service.yaml

CI/CD:

Projede GitHub Actions kullanılarak iki ayrı workflow oluşturulmuştur.

Build workflow:
- Her push sonrası çalışır
- Projeyi build eder

Deploy workflow:
- Self-hosted runner üzerinde çalışır
- Docker image oluşturur
- Kubernetes'e deploy eder

Self-hosted runner:

Deploy işlemleri lokal Kubernetes cluster’a erişim gerektirdiği için Ubuntu üzerinde self-hosted runner kurulmuştur.

Uygulamaya erişim:

kubectl port-forward service/todo-app-service 8080:80

Tarayıcıdan:
http://localhost:8080/tasks

Sonuç:

Uygulama Kubernetes üzerinde başarıyla çalıştırılmış, CI/CD ile otomatik deploy edilmiş ve /tasks endpoint’i üzerinden veri ekleme ve listeleme işlemleri başarıyla test edilmiştir.

Not:

Bu proje backend ve DevOps öğrenme sürecinin bir parçası olarak geliştirilmiştir.
