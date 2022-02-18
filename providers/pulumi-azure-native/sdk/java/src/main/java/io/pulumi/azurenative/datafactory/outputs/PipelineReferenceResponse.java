// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineReferenceResponse {
    /**
     * Reference name.
     * 
     */
    private final @Nullable String name;
    /**
     * Reference pipeline name.
     * 
     */
    private final String referenceName;
    /**
     * Pipeline reference type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"name","referenceName","type"})
    private PipelineReferenceResponse(
        @Nullable String name,
        String referenceName,
        String type) {
        this.name = name;
        this.referenceName = Objects.requireNonNull(referenceName);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Reference name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Reference pipeline name.
     * 
     */
    public String getReferenceName() {
        return this.referenceName;
    }
    /**
     * Pipeline reference type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setReferenceName(String referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public PipelineReferenceResponse build() {
            return new PipelineReferenceResponse(name, referenceName, type);
        }
    }
}
