// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupTemplateDeploymentState extends com.pulumi.resources.ResourceArgs {

    public static final GroupTemplateDeploymentState Empty = new GroupTemplateDeploymentState();

    /**
     * The Debug Level which should be used for this Resource Group Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
     * 
     */
    @Import(name="debugLevel")
    private @Nullable Output<String> debugLevel;

    /**
     * @return The Debug Level which should be used for this Resource Group Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
     * 
     */
    public Optional<Output<String>> debugLevel() {
        return Optional.ofNullable(this.debugLevel);
    }

    /**
     * The Azure Region where the Template should exist. Changing this forces a new Template to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Template should exist. Changing this forces a new Template to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="managementGroupId")
    private @Nullable Output<String> managementGroupId;

    public Optional<Output<String>> managementGroupId() {
        return Optional.ofNullable(this.managementGroupId);
    }

    /**
     * The name which should be used for this Template Deployment. Changing this forces a new Template Deployment to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Template Deployment. Changing this forces a new Template Deployment to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The JSON Content of the Outputs of the ARM Template Deployment.
     * 
     */
    @Import(name="outputContent")
    private @Nullable Output<String> outputContent;

    /**
     * @return The JSON Content of the Outputs of the ARM Template Deployment.
     * 
     */
    public Optional<Output<String>> outputContent() {
        return Optional.ofNullable(this.outputContent);
    }

    /**
     * The contents of the ARM Template parameters file - containing a JSON list of parameters.
     * 
     */
    @Import(name="parametersContent")
    private @Nullable Output<String> parametersContent;

    /**
     * @return The contents of the ARM Template parameters file - containing a JSON list of parameters.
     * 
     */
    public Optional<Output<String>> parametersContent() {
        return Optional.ofNullable(this.parametersContent);
    }

    /**
     * A mapping of tags which should be assigned to the Template.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Template.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The contents of the ARM Template which should be deployed into this Resource Group. Cannot be specified with `template_spec_version_id`.
     * 
     */
    @Import(name="templateContent")
    private @Nullable Output<String> templateContent;

    /**
     * @return The contents of the ARM Template which should be deployed into this Resource Group. Cannot be specified with `template_spec_version_id`.
     * 
     */
    public Optional<Output<String>> templateContent() {
        return Optional.ofNullable(this.templateContent);
    }

    /**
     * The ID of the Template Spec Version to deploy. Cannot be specified with `template_content`.
     * 
     */
    @Import(name="templateSpecVersionId")
    private @Nullable Output<String> templateSpecVersionId;

    /**
     * @return The ID of the Template Spec Version to deploy. Cannot be specified with `template_content`.
     * 
     */
    public Optional<Output<String>> templateSpecVersionId() {
        return Optional.ofNullable(this.templateSpecVersionId);
    }

    private GroupTemplateDeploymentState() {}

    private GroupTemplateDeploymentState(GroupTemplateDeploymentState $) {
        this.debugLevel = $.debugLevel;
        this.location = $.location;
        this.managementGroupId = $.managementGroupId;
        this.name = $.name;
        this.outputContent = $.outputContent;
        this.parametersContent = $.parametersContent;
        this.tags = $.tags;
        this.templateContent = $.templateContent;
        this.templateSpecVersionId = $.templateSpecVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupTemplateDeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupTemplateDeploymentState $;

        public Builder() {
            $ = new GroupTemplateDeploymentState();
        }

        public Builder(GroupTemplateDeploymentState defaults) {
            $ = new GroupTemplateDeploymentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param debugLevel The Debug Level which should be used for this Resource Group Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
         * 
         * @return builder
         * 
         */
        public Builder debugLevel(@Nullable Output<String> debugLevel) {
            $.debugLevel = debugLevel;
            return this;
        }

        /**
         * @param debugLevel The Debug Level which should be used for this Resource Group Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
         * 
         * @return builder
         * 
         */
        public Builder debugLevel(String debugLevel) {
            return debugLevel(Output.of(debugLevel));
        }

        /**
         * @param location The Azure Region where the Template should exist. Changing this forces a new Template to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Template should exist. Changing this forces a new Template to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder managementGroupId(@Nullable Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        /**
         * @param name The name which should be used for this Template Deployment. Changing this forces a new Template Deployment to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Template Deployment. Changing this forces a new Template Deployment to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputContent The JSON Content of the Outputs of the ARM Template Deployment.
         * 
         * @return builder
         * 
         */
        public Builder outputContent(@Nullable Output<String> outputContent) {
            $.outputContent = outputContent;
            return this;
        }

        /**
         * @param outputContent The JSON Content of the Outputs of the ARM Template Deployment.
         * 
         * @return builder
         * 
         */
        public Builder outputContent(String outputContent) {
            return outputContent(Output.of(outputContent));
        }

        /**
         * @param parametersContent The contents of the ARM Template parameters file - containing a JSON list of parameters.
         * 
         * @return builder
         * 
         */
        public Builder parametersContent(@Nullable Output<String> parametersContent) {
            $.parametersContent = parametersContent;
            return this;
        }

        /**
         * @param parametersContent The contents of the ARM Template parameters file - containing a JSON list of parameters.
         * 
         * @return builder
         * 
         */
        public Builder parametersContent(String parametersContent) {
            return parametersContent(Output.of(parametersContent));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Template.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Template.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param templateContent The contents of the ARM Template which should be deployed into this Resource Group. Cannot be specified with `template_spec_version_id`.
         * 
         * @return builder
         * 
         */
        public Builder templateContent(@Nullable Output<String> templateContent) {
            $.templateContent = templateContent;
            return this;
        }

        /**
         * @param templateContent The contents of the ARM Template which should be deployed into this Resource Group. Cannot be specified with `template_spec_version_id`.
         * 
         * @return builder
         * 
         */
        public Builder templateContent(String templateContent) {
            return templateContent(Output.of(templateContent));
        }

        /**
         * @param templateSpecVersionId The ID of the Template Spec Version to deploy. Cannot be specified with `template_content`.
         * 
         * @return builder
         * 
         */
        public Builder templateSpecVersionId(@Nullable Output<String> templateSpecVersionId) {
            $.templateSpecVersionId = templateSpecVersionId;
            return this;
        }

        /**
         * @param templateSpecVersionId The ID of the Template Spec Version to deploy. Cannot be specified with `template_content`.
         * 
         * @return builder
         * 
         */
        public Builder templateSpecVersionId(String templateSpecVersionId) {
            return templateSpecVersionId(Output.of(templateSpecVersionId));
        }

        public GroupTemplateDeploymentState build() {
            return $;
        }
    }

}
