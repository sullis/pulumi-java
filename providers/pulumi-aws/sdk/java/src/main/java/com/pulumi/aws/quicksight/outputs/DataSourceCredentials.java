// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.aws.quicksight.outputs.DataSourceCredentialsCredentialPair;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceCredentials {
    /**
     * @return - The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use.
     * When the value is not null, the `credential_pair` from the data source in the ARN is used.
     * 
     */
    private final @Nullable String copySourceArn;
    /**
     * @return - Credential pair. See Credential Pair below for more details.
     * 
     */
    private final @Nullable DataSourceCredentialsCredentialPair credentialPair;

    @CustomType.Constructor
    private DataSourceCredentials(
        @CustomType.Parameter("copySourceArn") @Nullable String copySourceArn,
        @CustomType.Parameter("credentialPair") @Nullable DataSourceCredentialsCredentialPair credentialPair) {
        this.copySourceArn = copySourceArn;
        this.credentialPair = credentialPair;
    }

    /**
     * @return - The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use.
     * When the value is not null, the `credential_pair` from the data source in the ARN is used.
     * 
     */
    public Optional<String> copySourceArn() {
        return Optional.ofNullable(this.copySourceArn);
    }
    /**
     * @return - Credential pair. See Credential Pair below for more details.
     * 
     */
    public Optional<DataSourceCredentialsCredentialPair> credentialPair() {
        return Optional.ofNullable(this.credentialPair);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String copySourceArn;
        private @Nullable DataSourceCredentialsCredentialPair credentialPair;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copySourceArn = defaults.copySourceArn;
    	      this.credentialPair = defaults.credentialPair;
        }

        public Builder copySourceArn(@Nullable String copySourceArn) {
            this.copySourceArn = copySourceArn;
            return this;
        }
        public Builder credentialPair(@Nullable DataSourceCredentialsCredentialPair credentialPair) {
            this.credentialPair = credentialPair;
            return this;
        }        public DataSourceCredentials build() {
            return new DataSourceCredentials(copySourceArn, credentialPair);
        }
    }
}
