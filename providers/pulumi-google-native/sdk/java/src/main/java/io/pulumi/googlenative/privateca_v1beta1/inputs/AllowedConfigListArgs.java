// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigWrapperArgs;
import java.util.List;
import java.util.Objects;


public final class AllowedConfigListArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllowedConfigListArgs Empty = new AllowedConfigListArgs();

    /**
     * All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper. If a ReusableConfigWrapper has an empty field, any value will be allowed for that field.
     * 
     */
    @InputImport(name="allowedConfigValues", required=true)
      private final Input<List<ReusableConfigWrapperArgs>> allowedConfigValues;

    public Input<List<ReusableConfigWrapperArgs>> getAllowedConfigValues() {
        return this.allowedConfigValues;
    }

    public AllowedConfigListArgs(Input<List<ReusableConfigWrapperArgs>> allowedConfigValues) {
        this.allowedConfigValues = Objects.requireNonNull(allowedConfigValues, "expected parameter 'allowedConfigValues' to be non-null");
    }

    private AllowedConfigListArgs() {
        this.allowedConfigValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedConfigListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ReusableConfigWrapperArgs>> allowedConfigValues;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedConfigListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedConfigValues = defaults.allowedConfigValues;
        }

        public Builder setAllowedConfigValues(Input<List<ReusableConfigWrapperArgs>> allowedConfigValues) {
            this.allowedConfigValues = Objects.requireNonNull(allowedConfigValues);
            return this;
        }

        public Builder setAllowedConfigValues(List<ReusableConfigWrapperArgs> allowedConfigValues) {
            this.allowedConfigValues = Input.of(Objects.requireNonNull(allowedConfigValues));
            return this;
        }
        public AllowedConfigListArgs build() {
            return new AllowedConfigListArgs(allowedConfigValues);
        }
    }
}