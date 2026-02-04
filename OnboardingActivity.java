public class OnboardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        Button btnContinue = findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(v -> {

            SharedPreferences prefs =
                    getSharedPreferences("AppPrefs", MODE_PRIVATE);

            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("onboarding_done", true);
            editor.apply();

            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
    }
}
