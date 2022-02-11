// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssessmentAWSServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentAWSServiceArgs Empty = new AssessmentAWSServiceArgs();

    @InputImport(name="serviceName")
    private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    public AssessmentAWSServiceArgs(@Nullable Input<String> serviceName) {
        this.serviceName = serviceName;
    }

    private AssessmentAWSServiceArgs() {
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentAWSServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentAWSServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public AssessmentAWSServiceArgs build() {
            return new AssessmentAWSServiceArgs(serviceName);
        }
    }
}
