# Choose Language / เลือกภาษา

[English](#english-ภาษาอังกฤษ) | [ไทย](#ภาษาไทย-thai)

---

### English (ภาษาอังกฤษ)

# FileCopy Java Application

This is a simple Java application to copy files from a source location to a destination folder. The files are copied with a base name and a sequential number, ensuring that each copied file has a unique name.

### Features
- Copies a file from a source path to a destination folder.
- Allows specifying a custom base name for the copied files.
- Generates files with sequential numbering appended to the base name.
- Supports any file type (based on file extension).

### Prerequisites
- JDK 8 or later.
- IDE such as IntelliJ IDEA or any Java compatible text editor.

### How to Run
1. Clone this repository or download the source code.
2. Set the path to the source file (`srcFile`) and the destination folder (`destFolder`) in the `main` method of the `FileCopy` class.
3. Optionally, modify the `count` variable to specify how many files you want to copy.
4. Run the program.

#### Example:
- `srcFile`: `"C:\\path\\to\\your\\source\\file.xml"`
- `destFolder`: `"C:\\path\\to\\destination\\folder"`
- `count`: `20`
- `baseFileName`: `"TestData_V2"`

The program will copy the source file 20 times with filenames like: TestData_V2_1.xml TestData_V2_2.xml ... TestData_V2_20.xml

### How it Works
- The program checks if the destination folder exists. If not, it will create the folder.
- The `baseFileName` and file extension are used to generate unique file names with the pattern:
    - `baseFileName_sequentialNumber.extension`
- The file is then copied to the destination folder using `Files.copy()` method.

### Example Output
File 1 copied to: C:\path\to\destination\folder\TestData_V2_1.xml

File 2 copied to: C:\path\to\destination\folder\TestData_V2_2.xml

...

File 20 copied to: C:\path\to\destination\folder\TestData_V2_20.xml

---

### ภาษาไทย (Thai)

# โปรเจคคัดลอกไฟล์

โปรแกรมนี้เป็นแอปพลิเคชัน Java ที่ใช้สำหรับคัดลอกไฟล์จากแหล่งที่มาไปยังโฟลเดอร์ปลายทาง โดยไฟล์ที่คัดลอกจะถูกตั้งชื่อใหม่โดยใช้ชื่อฐาน (base name) และหมายเลขลำดับเพื่อให้แต่ละไฟล์ที่คัดลอกมีชื่อที่ไม่ซ้ำกัน

### ฟีเจอร์
- คัดลอกไฟล์จากแหล่งที่มาทางพาธที่ระบุไปยังโฟลเดอร์ปลายทาง
- กำหนดชื่อฐานของไฟล์ที่คัดลอกได้
- สร้างไฟล์ใหม่โดยใช้หมายเลขลำดับที่เพิ่มขึ้นต่อท้ายชื่อฐาน
- รองรับทุกประเภทไฟล์ (ขึ้นอยู่กับส่วนขยายไฟล์)

### ข้อกำหนดเบื้องต้น
- JDK 8 หรือเวอร์ชันที่ใหม่กว่า
- IDE เช่น IntelliJ IDEA หรือโปรแกรมแก้ไขข้อความที่รองรับ Java

### วิธีการรันโปรแกรม
1. โคลนหรือดาวน์โหลดโค้ดจากที่เก็บนี้
2. ตั้งค่าพาธของไฟล์ต้นฉบับ (`srcFile`) และโฟลเดอร์ปลายทาง (`destFolder`) ในเมธอด `main` ของคลาส `FileCopy`
3. สามารถปรับค่า `count` เพื่อกำหนดจำนวนไฟล์ที่ต้องการคัดลอก
4. รันโปรแกรม

#### ตัวอย่าง:
- `srcFile`: `"C:\\path\\to\\your\\source\\file.xml"`
- `destFolder`: `"C:\\path\\to\\destination\\folder"`
- `count`: `20`
- `baseFileName`: `"TestData_V2"`

โปรแกรมจะคัดลอกไฟล์ต้นฉบับ 20 ครั้ง โดยไฟล์ที่คัดลอกจะมีชื่ออย่างเช่น: TestData_V2_1.xml TestData_V2_2.xml ... TestData_V2_20.xml

### วิธีการทำงาน
- โปรแกรมจะตรวจสอบว่าโฟลเดอร์ปลายทางมีอยู่หรือไม่ หากไม่มีก็จะสร้างโฟลเดอร์นั้น
- ชื่อฐาน (`baseFileName`) และส่วนขยายของไฟล์จะถูกใช้เพื่อสร้างชื่อไฟล์ที่ไม่ซ้ำกันโดยใช้รูปแบบ:
    - `baseFileName_หมายเลขลำดับ.ส่วนขยาย`
- ไฟล์จะถูกคัดลอกไปยังโฟลเดอร์ปลายทางโดยใช้เมธอด `Files.copy()`

### ตัวอย่างผลลัพธ์
File 1 copied to: C:\path\to\destination\folder\TestData_V2_1.xml

File 2 copied to: C:\path\to\destination\folder\TestData_V2_2.xml

...

File 20 copied to: C:\path\to\destination\folder\TestData_V2_20.xml
