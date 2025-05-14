# Проект архитектуры больницы 
В классе main создается обьект Hospital(реализован singleton), у обьекта есть поля для хранения сотрудников и пациентов. Обьекты создаются через фабрику, добавление пациентов к врачу реализовано с помощью DoctorPatientService, в сервисе сделано логирование с помощью паттерна observer.

Использованные паттерны проектрирования:

    1. Observer
    2. Singleton
    3. Abstract Factory

Сущности:

    1. Doctor
    2. Nurse
    3. Administrator
    4. Patient
    5. Room
    6. HospitalEquipment
