import java.util.Base64;

public class Secret {

    public static void main(String[] args) {
        String string = "Vm0wd2QyUXlVWGxWV0d4WFlURndUMVpzWkc5V1JteDBaVVYwV0ZKdGVGWlZNakExVmpKS1IySkVUbGhoTVVwVVZtcEdTMlJIVmtWUmJVWlhWbXhzTTFadGNFZFRNbEpJVm10a1dHSkdjRTlaYlhSTFZsWmFkR05GU214U2JWSkpWbTEwVjFWdFNrZFhiR2hYWWxoU00xWnNXbUZqTVZwMFVteGtUbFp1UWxoV1JscFhWakpHU0ZadVJsSldSM001";
        for (int i = 0; i < 12; i++) {
            string = new String(Base64.getDecoder().decode(string));
        }

        System.out.println(string);
    }

}
