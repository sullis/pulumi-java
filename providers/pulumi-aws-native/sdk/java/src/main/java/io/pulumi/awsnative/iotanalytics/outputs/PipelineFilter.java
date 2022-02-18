// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineFilter {
    private final String filter;
    private final String name;
    private final @Nullable String next;

    @OutputCustomType.Constructor({"filter","name","next"})
    private PipelineFilter(
        String filter,
        String name,
        @Nullable String next) {
        this.filter = Objects.requireNonNull(filter);
        this.name = Objects.requireNonNull(name);
        this.next = next;
    }

    public String getFilter() {
        return this.filter;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNext() {
        return Optional.ofNullable(this.next);
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
