// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTemplateArgs Empty = new GetTemplateArgs();

    @InputImport(name="awsAccountId", required=true)
    private final String awsAccountId;

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    @InputImport(name="templateId", required=true)
    private final String templateId;

    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateArgs(
        String awsAccountId,
        String templateId) {
        this.awsAccountId = Objects.requireNonNull(awsAccountId, "expected parameter 'awsAccountId' to be non-null");
        this.templateId = Objects.requireNonNull(templateId, "expected parameter 'templateId' to be non-null");
    }

    private GetTemplateArgs() {
        this.awsAccountId = null;
        this.templateId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsAccountId;
        private String templateId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.templateId = defaults.templateId;
        }

        public Builder setAwsAccountId(String awsAccountId) {
            this.awsAccountId = Objects.requireNonNull(awsAccountId);
            return this;
        }

        public Builder setTemplateId(String templateId) {
            this.templateId = Objects.requireNonNull(templateId);
            return this;
        }

        public GetTemplateArgs build() {
            return new GetTemplateArgs(awsAccountId, templateId);
        }
    }
}
