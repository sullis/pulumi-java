// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ImageRecipeComponentParameter {
    private final String name;
    private final List<String> value;

    @OutputCustomType.Constructor({"name","value"})
    private ImageRecipeComponentParameter(
        String name,
        List<String> value) {
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    public String getName() {
        return this.name;
    }
    public List<String> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeComponentParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeComponentParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(List<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ImageRecipeComponentParameter build() {
            return new ImageRecipeComponentParameter(name, value);
        }
    }
}
