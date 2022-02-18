// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetProvisioningTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProvisioningTemplateArgs Empty = new GetProvisioningTemplateArgs();

    @InputImport(name="templateName", required=true)
    private final String templateName;

    public String getTemplateName() {
        return this.templateName;
    }

    public GetProvisioningTemplateArgs(String templateName) {
        this.templateName = Objects.requireNonNull(templateName, "expected parameter 'templateName' to be non-null");
    }

    private GetProvisioningTemplateArgs() {
        this.templateName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProvisioningTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String templateName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProvisioningTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.templateName = defaults.templateName;
        }

        public Builder setTemplateName(String templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }

        public GetProvisioningTemplateArgs build() {
            return new GetProvisioningTemplateArgs(templateName);
        }
    }
}
