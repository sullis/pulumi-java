// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineFilter extends io.pulumi.resources.InvokeArgs {

    public static final PipelineFilter Empty = new PipelineFilter();

    @InputImport(name="filter", required=true)
    private final String filter;

    public String getFilter() {
        return this.filter;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="next")
    private final @Nullable String next;

    public Optional<String> getNext() {
        return this.next == null ? Optional.empty() : Optional.ofNullable(this.next);
    }

    public PipelineFilter(
        String filter,
        String name,
        @Nullable String next) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineFilter() {
        this.filter = null;
        this.name = null;
        this.next = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNext(@Nullable String next) {
            this.next = next;
            return this;
        }

        public PipelineFilter build() {
            return new PipelineFilter(filter, name, next);
        }
    }
}
