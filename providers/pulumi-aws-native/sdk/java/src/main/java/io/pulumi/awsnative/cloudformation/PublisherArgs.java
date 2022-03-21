// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublisherArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublisherArgs Empty = new PublisherArgs();

    /**
     * Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must accept the terms and conditions in order to publish public extensions to the CloudFormation registry. The terms and conditions can be found at https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf
     * 
     */
    @Import(name="acceptTermsAndConditions", required=true)
      private final Output<Boolean> acceptTermsAndConditions;

    public Output<Boolean> getAcceptTermsAndConditions() {
        return this.acceptTermsAndConditions;
    }

    /**
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your connection to that account.
     * 
     */
    @Import(name="connectionArn")
      private final @Nullable Output<String> connectionArn;

    public Output<String> getConnectionArn() {
        return this.connectionArn == null ? Output.empty() : this.connectionArn;
    }

    public PublisherArgs(
        Output<Boolean> acceptTermsAndConditions,
        @Nullable Output<String> connectionArn) {
        this.acceptTermsAndConditions = Objects.requireNonNull(acceptTermsAndConditions, "expected parameter 'acceptTermsAndConditions' to be non-null");
        this.connectionArn = connectionArn;
    }

    private PublisherArgs() {
        this.acceptTermsAndConditions = Output.empty();
        this.connectionArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublisherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> acceptTermsAndConditions;
        private @Nullable Output<String> connectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PublisherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptTermsAndConditions = defaults.acceptTermsAndConditions;
    	      this.connectionArn = defaults.connectionArn;
        }

        public Builder acceptTermsAndConditions(Output<Boolean> acceptTermsAndConditions) {
            this.acceptTermsAndConditions = Objects.requireNonNull(acceptTermsAndConditions);
            return this;
        }
        public Builder acceptTermsAndConditions(Boolean acceptTermsAndConditions) {
            this.acceptTermsAndConditions = Output.of(Objects.requireNonNull(acceptTermsAndConditions));
            return this;
        }
        public Builder connectionArn(@Nullable Output<String> connectionArn) {
            this.connectionArn = connectionArn;
            return this;
        }
        public Builder connectionArn(@Nullable String connectionArn) {
            this.connectionArn = Output.ofNullable(connectionArn);
            return this;
        }        public PublisherArgs build() {
            return new PublisherArgs(acceptTermsAndConditions, connectionArn);
        }
    }
}
