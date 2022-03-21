// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApprovalRuleTemplateAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApprovalRuleTemplateAssociationArgs Empty = new ApprovalRuleTemplateAssociationArgs();

    /**
     * The name for the approval rule template.
     * 
     */
    @Import(name="approvalRuleTemplateName", required=true)
      private final Output<String> approvalRuleTemplateName;

    public Output<String> getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * The name of the repository that you want to associate with the template.
     * 
     */
    @Import(name="repositoryName", required=true)
      private final Output<String> repositoryName;

    public Output<String> getRepositoryName() {
        return this.repositoryName;
    }

    public ApprovalRuleTemplateAssociationArgs(
        Output<String> approvalRuleTemplateName,
        Output<String> repositoryName) {
        this.approvalRuleTemplateName = Objects.requireNonNull(approvalRuleTemplateName, "expected parameter 'approvalRuleTemplateName' to be non-null");
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
    }

    private ApprovalRuleTemplateAssociationArgs() {
        this.approvalRuleTemplateName = Output.empty();
        this.repositoryName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApprovalRuleTemplateAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> approvalRuleTemplateName;
        private Output<String> repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApprovalRuleTemplateAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRuleTemplateName = defaults.approvalRuleTemplateName;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder approvalRuleTemplateName(Output<String> approvalRuleTemplateName) {
            this.approvalRuleTemplateName = Objects.requireNonNull(approvalRuleTemplateName);
            return this;
        }
        public Builder approvalRuleTemplateName(String approvalRuleTemplateName) {
            this.approvalRuleTemplateName = Output.of(Objects.requireNonNull(approvalRuleTemplateName));
            return this;
        }
        public Builder repositoryName(Output<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Output.of(Objects.requireNonNull(repositoryName));
            return this;
        }        public ApprovalRuleTemplateAssociationArgs build() {
            return new ApprovalRuleTemplateAssociationArgs(approvalRuleTemplateName, repositoryName);
        }
    }
}
