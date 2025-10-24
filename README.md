# SRO7 (Java)

Набор учебных заданий ("SRO") в пакете `ektu.korgan.sakauov.sro7`:

- Студенты: `SroStudent`, `SroStudentService`, `SroStudentNotFoundException`, `SroBox`, `StudentsRunner`.
- Автопарк: `SroServiceable`, `SroVehicle`, `SroCar`, `SroTruck`, `SroBus`, `SroGarage`, `SroGarageFullException`, `FleetRunner`.

## Как собрать и запустить (Windows PowerShell)

```powershell
# из корня проекта
javac -d out -sourcepath src src/ektu/korgan/sakauov/sro7/*.java

# Автопарк демо
java -cp out ektu.korgan.sakauov.sro7.FleetRunner

# Менеджер студентов (консольное меню)
java -cp out ektu.korgan.sakauov.sro7.StudentsRunner
```

Примечание: для корректного вывода русских букв настройте кодировку консоли (например, chcp 65001) или используйте терминал с UTF‑8.