// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexValueImportanceItem extends io.pulumi.resources.InvokeArgs {

    public static final IndexValueImportanceItem Empty = new IndexValueImportanceItem();

    @InputImport(name="key")
    private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    @InputImport(name="value")
    private final @Nullable Integer value;

    public Optional<Integer> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public IndexValueImportanceItem(
        @Nullable String key,
        @Nullable Integer value) {
        this.key = key;
        this.value = value;
    }

    private IndexValueImportanceItem() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexValueImportanceItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexValueImportanceItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setValue(@Nullable Integer value) {
            this.value = value;
            return this;
        }

        public IndexValueImportanceItem build() {
            return new IndexValueImportanceItem(key, value);
        }
    }
}
