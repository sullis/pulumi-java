// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.inputs.DataSourceCredentialPairArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Data source credentials. This is a variant type structure. For this structure to be
 *             valid, only one of the attributes can be non-null.&lt;/p&gt;
 * 
 */
public final class DataSourceCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceCredentialsArgs Empty = new DataSourceCredentialsArgs();

    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of a data source that has the credential pair that you
     *             want to use. When &lt;code&gt;CopySourceArn&lt;/code&gt; is not null, the credential pair from the
     *             data source in the ARN is used as the credentials for the
     *             &lt;code&gt;DataSourceCredentials&lt;/code&gt; structure.&lt;/p&gt;
     * 
     */
    @Import(name="copySourceArn")
    private @Nullable Output<String> copySourceArn;

    /**
     * @return &lt;p&gt;The Amazon Resource Name (ARN) of a data source that has the credential pair that you
     *             want to use. When &lt;code&gt;CopySourceArn&lt;/code&gt; is not null, the credential pair from the
     *             data source in the ARN is used as the credentials for the
     *             &lt;code&gt;DataSourceCredentials&lt;/code&gt; structure.&lt;/p&gt;
     * 
     */
    public Optional<Output<String>> copySourceArn() {
        return Optional.ofNullable(this.copySourceArn);
    }

    @Import(name="credentialPair")
    private @Nullable Output<DataSourceCredentialPairArgs> credentialPair;

    public Optional<Output<DataSourceCredentialPairArgs>> credentialPair() {
        return Optional.ofNullable(this.credentialPair);
    }

    private DataSourceCredentialsArgs() {}

    private DataSourceCredentialsArgs(DataSourceCredentialsArgs $) {
        this.copySourceArn = $.copySourceArn;
        this.credentialPair = $.credentialPair;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceCredentialsArgs $;

        public Builder() {
            $ = new DataSourceCredentialsArgs();
        }

        public Builder(DataSourceCredentialsArgs defaults) {
            $ = new DataSourceCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param copySourceArn &lt;p&gt;The Amazon Resource Name (ARN) of a data source that has the credential pair that you
         *             want to use. When &lt;code&gt;CopySourceArn&lt;/code&gt; is not null, the credential pair from the
         *             data source in the ARN is used as the credentials for the
         *             &lt;code&gt;DataSourceCredentials&lt;/code&gt; structure.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder copySourceArn(@Nullable Output<String> copySourceArn) {
            $.copySourceArn = copySourceArn;
            return this;
        }

        /**
         * @param copySourceArn &lt;p&gt;The Amazon Resource Name (ARN) of a data source that has the credential pair that you
         *             want to use. When &lt;code&gt;CopySourceArn&lt;/code&gt; is not null, the credential pair from the
         *             data source in the ARN is used as the credentials for the
         *             &lt;code&gt;DataSourceCredentials&lt;/code&gt; structure.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder copySourceArn(String copySourceArn) {
            return copySourceArn(Output.of(copySourceArn));
        }

        public Builder credentialPair(@Nullable Output<DataSourceCredentialPairArgs> credentialPair) {
            $.credentialPair = credentialPair;
            return this;
        }

        public Builder credentialPair(DataSourceCredentialPairArgs credentialPair) {
            return credentialPair(Output.of(credentialPair));
        }

        public DataSourceCredentialsArgs build() {
            return $;
        }
    }

}
