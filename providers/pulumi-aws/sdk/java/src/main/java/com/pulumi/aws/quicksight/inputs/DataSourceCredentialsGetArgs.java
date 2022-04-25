// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.aws.quicksight.inputs.DataSourceCredentialsCredentialPairGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceCredentialsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceCredentialsGetArgs Empty = new DataSourceCredentialsGetArgs();

    /**
     * - The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use.
     *   When the value is not null, the `credential_pair` from the data source in the ARN is used.
     * 
     */
    @Import(name="copySourceArn")
    private @Nullable Output<String> copySourceArn;

    /**
     * @return - The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use.
     * When the value is not null, the `credential_pair` from the data source in the ARN is used.
     * 
     */
    public Optional<Output<String>> copySourceArn() {
        return Optional.ofNullable(this.copySourceArn);
    }

    /**
     * - Credential pair. See Credential Pair below for more details.
     * 
     */
    @Import(name="credentialPair")
    private @Nullable Output<DataSourceCredentialsCredentialPairGetArgs> credentialPair;

    /**
     * @return - Credential pair. See Credential Pair below for more details.
     * 
     */
    public Optional<Output<DataSourceCredentialsCredentialPairGetArgs>> credentialPair() {
        return Optional.ofNullable(this.credentialPair);
    }

    private DataSourceCredentialsGetArgs() {}

    private DataSourceCredentialsGetArgs(DataSourceCredentialsGetArgs $) {
        this.copySourceArn = $.copySourceArn;
        this.credentialPair = $.credentialPair;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceCredentialsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceCredentialsGetArgs $;

        public Builder() {
            $ = new DataSourceCredentialsGetArgs();
        }

        public Builder(DataSourceCredentialsGetArgs defaults) {
            $ = new DataSourceCredentialsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param copySourceArn - The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use.
         * When the value is not null, the `credential_pair` from the data source in the ARN is used.
         * 
         * @return builder
         * 
         */
        public Builder copySourceArn(@Nullable Output<String> copySourceArn) {
            $.copySourceArn = copySourceArn;
            return this;
        }

        /**
         * @param copySourceArn - The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use.
         * When the value is not null, the `credential_pair` from the data source in the ARN is used.
         * 
         * @return builder
         * 
         */
        public Builder copySourceArn(String copySourceArn) {
            return copySourceArn(Output.of(copySourceArn));
        }

        /**
         * @param credentialPair - Credential pair. See Credential Pair below for more details.
         * 
         * @return builder
         * 
         */
        public Builder credentialPair(@Nullable Output<DataSourceCredentialsCredentialPairGetArgs> credentialPair) {
            $.credentialPair = credentialPair;
            return this;
        }

        /**
         * @param credentialPair - Credential pair. See Credential Pair below for more details.
         * 
         * @return builder
         * 
         */
        public Builder credentialPair(DataSourceCredentialsCredentialPairGetArgs credentialPair) {
            return credentialPair(Output.of(credentialPair));
        }

        public DataSourceCredentialsGetArgs build() {
            return $;
        }
    }

}
