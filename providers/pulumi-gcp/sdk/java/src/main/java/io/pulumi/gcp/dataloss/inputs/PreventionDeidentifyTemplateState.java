// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateState extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateState Empty = new PreventionDeidentifyTemplateState();

    /**
     * Configuration of the deidentify template
     * Structure is documented below.
     * 
     */
    @InputImport(name="deidentifyConfig")
      private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigGetArgs> deidentifyConfig;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigGetArgs> getDeidentifyConfig() {
        return this.deidentifyConfig == null ? Input.empty() : this.deidentifyConfig;
    }

    /**
     * A description of the template.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User set display name of the template.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Name of the information type. Either a name of your choosing when creating a CustomInfoType, or one of the names listed at [https://cloud.google.com/dlp/docs/infotypes-reference](https://cloud.google.com/dlp/docs/infotypes-reference) when specifying a built-in type. When sending Cloud DLP results to Data Catalog, infoType names should conform to the pattern `[A-Za-z0-9$-_]{1,64}`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The parent of the template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    public PreventionDeidentifyTemplateState(
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigGetArgs> deidentifyConfig,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<String> parent) {
        this.deidentifyConfig = deidentifyConfig;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.parent = parent;
    }

    private PreventionDeidentifyTemplateState() {
        this.deidentifyConfig = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.parent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigGetArgs> deidentifyConfig;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deidentifyConfig = defaults.deidentifyConfig;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
        }

        public Builder setDeidentifyConfig(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigGetArgs> deidentifyConfig) {
            this.deidentifyConfig = deidentifyConfig;
            return this;
        }

        public Builder setDeidentifyConfig(@Nullable PreventionDeidentifyTemplateDeidentifyConfigGetArgs deidentifyConfig) {
            this.deidentifyConfig = Input.ofNullable(deidentifyConfig);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }
        public PreventionDeidentifyTemplateState build() {
            return new PreventionDeidentifyTemplateState(deidentifyConfig, description, displayName, name, parent);
        }
    }
}