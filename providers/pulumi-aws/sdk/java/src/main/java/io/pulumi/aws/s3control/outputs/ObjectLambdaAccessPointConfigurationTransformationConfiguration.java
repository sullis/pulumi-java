// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.outputs;

import io.pulumi.aws.s3control.outputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ObjectLambdaAccessPointConfigurationTransformationConfiguration {
    /**
     * The actions of an Object Lambda Access Point configuration. Valid values: `GetObject`.
     * 
     */
    private final List<String> actions;
    /**
     * The content transformation of an Object Lambda Access Point configuration. See Content Transformation below for more details.
     * 
     */
    private final ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation contentTransformation;

    @CustomType.Constructor
    private ObjectLambdaAccessPointConfigurationTransformationConfiguration(
        @CustomType.Parameter("actions") List<String> actions,
        @CustomType.Parameter("contentTransformation") ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation contentTransformation) {
        this.actions = actions;
        this.contentTransformation = contentTransformation;
    }

    /**
     * The actions of an Object Lambda Access Point configuration. Valid values: `GetObject`.
     * 
    */
    public List<String> actions() {
        return this.actions;
    }
    /**
     * The content transformation of an Object Lambda Access Point configuration. See Content Transformation below for more details.
     * 
    */
    public ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation contentTransformation() {
        return this.contentTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfigurationTransformationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation contentTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointConfigurationTransformationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.contentTransformation = defaults.contentTransformation;
        }

        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder contentTransformation(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation contentTransformation) {
            this.contentTransformation = Objects.requireNonNull(contentTransformation);
            return this;
        }        public ObjectLambdaAccessPointConfigurationTransformationConfiguration build() {
            return new ObjectLambdaAccessPointConfigurationTransformationConfiguration(actions, contentTransformation);
        }
    }
}
