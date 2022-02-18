// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Template Spec artifact containing an embedded Azure Resource Manager template for use as a linked template.
 * 
 */
public final class LinkedTemplateArtifactArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedTemplateArtifactArgs Empty = new LinkedTemplateArtifactArgs();

    /**
     * A filesystem safe relative path of the artifact.
     * 
     */
    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * The Azure Resource Manager template.
     * 
     */
    @InputImport(name="template", required=true)
    private final Input<Object> template;

    public Input<Object> getTemplate() {
        return this.template;
    }

    public LinkedTemplateArtifactArgs(
        Input<String> path,
        Input<Object> template) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
    }

    private LinkedTemplateArtifactArgs() {
        this.path = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedTemplateArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> path;
        private Input<Object> template;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedTemplateArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.template = defaults.template;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setTemplate(Input<Object> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTemplate(Object template) {
            this.template = Input.of(Objects.requireNonNull(template));
            return this;
        }

        public LinkedTemplateArtifactArgs build() {
            return new LinkedTemplateArtifactArgs(path, template);
        }
    }
}
