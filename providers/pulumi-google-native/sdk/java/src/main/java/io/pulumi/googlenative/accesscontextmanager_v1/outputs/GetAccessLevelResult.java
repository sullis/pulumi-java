// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.BasicLevelResponse;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.CustomLevelResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAccessLevelResult {
    /**
     * A `BasicLevel` composed of `Conditions`.
     * 
     */
    private final BasicLevelResponse basic;
    /**
     * A `CustomLevel` written in the Common Expression Language.
     * 
     */
    private final CustomLevelResponse custom;
    /**
     * Description of the `AccessLevel` and its use. Does not affect behavior.
     * 
     */
    private final String description;
    /**
     * Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{access_policy}/accessLevels/{access_level}`. The maximum length of the `access_level` component is 50 characters.
     * 
     */
    private final String name;
    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"basic","custom","description","name","title"})
    private GetAccessLevelResult(
        BasicLevelResponse basic,
        CustomLevelResponse custom,
        String description,
        String name,
        String title) {
        this.basic = Objects.requireNonNull(basic);
        this.custom = Objects.requireNonNull(custom);
        this.description = Objects.requireNonNull(description);
        this.name = Objects.requireNonNull(name);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * A `BasicLevel` composed of `Conditions`.
     * 
    */
    public BasicLevelResponse getBasic() {
        return this.basic;
    }
    /**
     * A `CustomLevel` written in the Common Expression Language.
     * 
    */
    public CustomLevelResponse getCustom() {
        return this.custom;
    }
    /**
     * Description of the `AccessLevel` and its use. Does not affect behavior.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{access_policy}/accessLevels/{access_level}`. The maximum length of the `access_level` component is 50 characters.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Human readable title. Must be unique within the Policy.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessLevelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicLevelResponse basic;
        private CustomLevelResponse custom;
        private String description;
        private String name;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessLevelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basic = defaults.basic;
    	      this.custom = defaults.custom;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.title = defaults.title;
        }

        public Builder setBasic(BasicLevelResponse basic) {
            this.basic = Objects.requireNonNull(basic);
            return this;
        }

        public Builder setCustom(CustomLevelResponse custom) {
            this.custom = Objects.requireNonNull(custom);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GetAccessLevelResult build() {
            return new GetAccessLevelResult(basic, custom, description, name, title);
        }
    }
}