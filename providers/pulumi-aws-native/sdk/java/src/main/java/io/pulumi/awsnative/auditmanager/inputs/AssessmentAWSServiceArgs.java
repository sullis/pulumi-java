// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An AWS service such as Amazon S3, AWS CloudTrail, and so on.
 * 
 */
public final class AssessmentAWSServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentAWSServiceArgs Empty = new AssessmentAWSServiceArgs();

    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    public AssessmentAWSServiceArgs(@Nullable Output<String> serviceName) {
        this.serviceName = serviceName;
    }

    private AssessmentAWSServiceArgs() {
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentAWSServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentAWSServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceName = defaults.serviceName;
        }

        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }        public AssessmentAWSServiceArgs build() {
            return new AssessmentAWSServiceArgs(serviceName);
        }
    }
}
