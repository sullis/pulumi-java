// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKeyWebSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyWebSettingsGetArgs Empty = new EnterpriseKeyWebSettingsGetArgs();

    /**
     * If set to true, it means allowed_domains will not be enforced.
     * 
     */
    @InputImport(name="allowAllDomains")
    private final @Nullable Input<Boolean> allowAllDomains;

    public Input<Boolean> getAllowAllDomains() {
        return this.allowAllDomains == null ? Input.empty() : this.allowAllDomains;
    }

    /**
     * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
     * 
     */
    @InputImport(name="allowAmpTraffic")
    private final @Nullable Input<Boolean> allowAmpTraffic;

    public Input<Boolean> getAllowAmpTraffic() {
        return this.allowAmpTraffic == null ? Input.empty() : this.allowAmpTraffic;
    }

    /**
     * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: 'example.com' or 'subdomain.example.com'
     * 
     */
    @InputImport(name="allowedDomains")
    private final @Nullable Input<List<String>> allowedDomains;

    public Input<List<String>> getAllowedDomains() {
        return this.allowedDomains == null ? Input.empty() : this.allowedDomains;
    }

    /**
     * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE. Possible values: CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED, USABILITY, BALANCE, SECURITY
     * 
     */
    @InputImport(name="challengeSecurityPreference")
    private final @Nullable Input<String> challengeSecurityPreference;

    public Input<String> getChallengeSecurityPreference() {
        return this.challengeSecurityPreference == null ? Input.empty() : this.challengeSecurityPreference;
    }

    /**
     * Required. Describes how this key is integrated with the website. Possible values: SCORE, CHECKBOX, INVISIBLE
     * 
     */
    @InputImport(name="integrationType", required=true)
    private final Input<String> integrationType;

    public Input<String> getIntegrationType() {
        return this.integrationType;
    }

    public EnterpriseKeyWebSettingsGetArgs(
        @Nullable Input<Boolean> allowAllDomains,
        @Nullable Input<Boolean> allowAmpTraffic,
        @Nullable Input<List<String>> allowedDomains,
        @Nullable Input<String> challengeSecurityPreference,
        Input<String> integrationType) {
        this.allowAllDomains = allowAllDomains;
        this.allowAmpTraffic = allowAmpTraffic;
        this.allowedDomains = allowedDomains;
        this.challengeSecurityPreference = challengeSecurityPreference;
        this.integrationType = Objects.requireNonNull(integrationType, "expected parameter 'integrationType' to be non-null");
    }

    private EnterpriseKeyWebSettingsGetArgs() {
        this.allowAllDomains = Input.empty();
        this.allowAmpTraffic = Input.empty();
        this.allowedDomains = Input.empty();
        this.challengeSecurityPreference = Input.empty();
        this.integrationType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyWebSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowAllDomains;
        private @Nullable Input<Boolean> allowAmpTraffic;
        private @Nullable Input<List<String>> allowedDomains;
        private @Nullable Input<String> challengeSecurityPreference;
        private Input<String> integrationType;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyWebSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllDomains = defaults.allowAllDomains;
    	      this.allowAmpTraffic = defaults.allowAmpTraffic;
    	      this.allowedDomains = defaults.allowedDomains;
    	      this.challengeSecurityPreference = defaults.challengeSecurityPreference;
    	      this.integrationType = defaults.integrationType;
        }

        public Builder setAllowAllDomains(@Nullable Input<Boolean> allowAllDomains) {
            this.allowAllDomains = allowAllDomains;
            return this;
        }

        public Builder setAllowAllDomains(@Nullable Boolean allowAllDomains) {
            this.allowAllDomains = Input.ofNullable(allowAllDomains);
            return this;
        }

        public Builder setAllowAmpTraffic(@Nullable Input<Boolean> allowAmpTraffic) {
            this.allowAmpTraffic = allowAmpTraffic;
            return this;
        }

        public Builder setAllowAmpTraffic(@Nullable Boolean allowAmpTraffic) {
            this.allowAmpTraffic = Input.ofNullable(allowAmpTraffic);
            return this;
        }

        public Builder setAllowedDomains(@Nullable Input<List<String>> allowedDomains) {
            this.allowedDomains = allowedDomains;
            return this;
        }

        public Builder setAllowedDomains(@Nullable List<String> allowedDomains) {
            this.allowedDomains = Input.ofNullable(allowedDomains);
            return this;
        }

        public Builder setChallengeSecurityPreference(@Nullable Input<String> challengeSecurityPreference) {
            this.challengeSecurityPreference = challengeSecurityPreference;
            return this;
        }

        public Builder setChallengeSecurityPreference(@Nullable String challengeSecurityPreference) {
            this.challengeSecurityPreference = Input.ofNullable(challengeSecurityPreference);
            return this;
        }

        public Builder setIntegrationType(Input<String> integrationType) {
            this.integrationType = Objects.requireNonNull(integrationType);
            return this;
        }

        public Builder setIntegrationType(String integrationType) {
            this.integrationType = Input.of(Objects.requireNonNull(integrationType));
            return this;
        }

        public EnterpriseKeyWebSettingsGetArgs build() {
            return new EnterpriseKeyWebSettingsGetArgs(allowAllDomains, allowAmpTraffic, allowedDomains, challengeSecurityPreference, integrationType);
        }
    }
}
