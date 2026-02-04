public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {

            SharedPreferences prefs =
                    getSharedPreferences("AppPrefs", MODE_PRIVATE);

            boolean isOnboardingDone =
                    prefs.getBoolean("onboarding_done", false);

            if (isOnboardingDone) {
                startActivity(new Intent(this, LoginActivity.class));
            } else {
                startActivity(new Intent(this, OnboardingActivity.class));
            }

            finish();

        }, 2000); // 2 seconds splash
    }
}
