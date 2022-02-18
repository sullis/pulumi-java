// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Definition of the runbook property type.
 * 
 */
public final class ContentHashArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentHashArgs Empty = new ContentHashArgs();

    /**
     * Gets or sets the content hash algorithm used to hash the content.
     * 
     */
    @InputImport(name="algorithm", required=true)
    private final Input<String> algorithm;

    public Input<String> getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Gets or sets expected hash value of the content.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ContentHashArgs(
        Input<String> algorithm,
        Input<String> value) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ContentHashArgs() {
        this.algorithm = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentHashArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> algorithm;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentHashArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.value = defaults.value;
        }

        public Builder setAlgorithm(Input<String> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Input.of(Objects.requireNonNull(algorithm));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public ContentHashArgs build() {
            return new ContentHashArgs(algorithm, value);
        }
    }
}
