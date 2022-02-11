// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.MitigationActionReplaceDefaultPolicyVersionParamsTemplateName;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class MitigationActionReplaceDefaultPolicyVersionParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionReplaceDefaultPolicyVersionParamsArgs Empty = new MitigationActionReplaceDefaultPolicyVersionParamsArgs();

    @InputImport(name="templateName", required=true)
    private final Input<MitigationActionReplaceDefaultPolicyVersionParamsTemplateName> templateName;

    public Input<MitigationActionReplaceDefaultPolicyVersionParamsTemplateName> getTemplateName() {
        return this.templateName;
    }

    public MitigationActionReplaceDefaultPolicyVersionParamsArgs(Input<MitigationActionReplaceDefaultPolicyVersionParamsTemplateName> templateName) {
        this.templateName = Objects.requireNonNull(templateName, "expected parameter 'templateName' to be non-null");
    }

    private MitigationActionReplaceDefaultPolicyVersionParamsArgs() {
        this.templateName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionReplaceDefaultPolicyVersionParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MitigationActionReplaceDefaultPolicyVersionParamsTemplateName> templateName;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionReplaceDefaultPolicyVersionParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.templateName = defaults.templateName;
        }

        public Builder setTemplateName(Input<MitigationActionReplaceDefaultPolicyVersionParamsTemplateName> templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }

        public Builder setTemplateName(MitigationActionReplaceDefaultPolicyVersionParamsTemplateName templateName) {
            this.templateName = Input.of(Objects.requireNonNull(templateName));
            return this;
        }

        public MitigationActionReplaceDefaultPolicyVersionParamsArgs build() {
            return new MitigationActionReplaceDefaultPolicyVersionParamsArgs(templateName);
        }
    }
}
