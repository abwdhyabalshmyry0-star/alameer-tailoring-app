# دليل تشغيل تطبيق الأمير أندرويد واستخراج ملف APK

1. افتح Android Studio واختر Open ثم اختر مجلد android.
2. انتظر اكتمال Gradle Sync.
3. لتثبيت وتشغيل التطبيق على جوالك:
   - فعّل خيارات المطور (Developer Options) وتصحيح USB (USB Debugging).
   - وصّل الجوال بالكمبيوتر واضغط Run (Shift + F10).
4. لاستخراج ملف التثبيت المباشر (APK):
   - من القائمة العلوية: Build > Build Bundle(s) / APK(s) > Build APK(s)
   - ستجد الملف في المسار: app/build/outputs/apk/debug/app-debug.apk