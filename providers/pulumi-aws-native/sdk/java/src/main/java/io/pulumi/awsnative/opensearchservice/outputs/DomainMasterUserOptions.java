// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainMasterUserOptions {
    private final @Nullable String masterUserARN;
    private final @Nullable String masterUserName;
    private final @Nullable String masterUserPassword;

    @CustomType.Constructor
    private DomainMasterUserOptions(
        @CustomType.Parameter("masterUserARN") @Nullable String masterUserARN,
        @CustomType.Parameter("masterUserName") @Nullable String masterUserName,
        @CustomType.Parameter("masterUserPassword") @Nullable String masterUserPassword) {
        this.masterUserARN = masterUserARN;
        this.masterUserName = masterUserName;
        this.masterUserPassword = masterUserPassword;
    }

    public Optional<String> masterUserARN() {
        return Optional.ofNullable(this.masterUserARN);
    }
    public Optional<String> masterUserName() {
        return Optional.ofNullable(this.masterUserName);
    }
    public Optional<String> masterUserPassword() {
        return Optional.ofNullable(this.masterUserPassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMasterUserOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String masterUserARN;
        private @Nullable String masterUserName;
        private @Nullable String masterUserPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMasterUserOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterUserARN = defaults.masterUserARN;
    	      this.masterUserName = defaults.masterUserName;
    	      this.masterUserPassword = defaults.masterUserPassword;
        }

        public Builder masterUserARN(@Nullable String masterUserARN) {
            this.masterUserARN = masterUserARN;
            return this;
        }
        public Builder masterUserName(@Nullable String masterUserName) {
            this.masterUserName = masterUserName;
            return this;
        }
        public Builder masterUserPassword(@Nullable String masterUserPassword) {
            this.masterUserPassword = masterUserPassword;
            return this;
        }        public DomainMasterUserOptions build() {
            return new DomainMasterUserOptions(masterUserARN, masterUserName, masterUserPassword);
        }
    }
}
