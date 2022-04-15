// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Athena engine version for running queries.
 * 
 */
public final class WorkGroupEngineVersion extends io.pulumi.resources.InvokeArgs {

    public static final WorkGroupEngineVersion Empty = new WorkGroupEngineVersion();

    @Import(name="effectiveEngineVersion")
      private final @Nullable String effectiveEngineVersion;

    public Optional<String> effectiveEngineVersion() {
        return this.effectiveEngineVersion == null ? Optional.empty() : Optional.ofNullable(this.effectiveEngineVersion);
    }

    @Import(name="selectedEngineVersion")
      private final @Nullable String selectedEngineVersion;

    public Optional<String> selectedEngineVersion() {
        return this.selectedEngineVersion == null ? Optional.empty() : Optional.ofNullable(this.selectedEngineVersion);
    }

    public WorkGroupEngineVersion(
        @Nullable String effectiveEngineVersion,
        @Nullable String selectedEngineVersion) {
        this.effectiveEngineVersion = effectiveEngineVersion;
        this.selectedEngineVersion = selectedEngineVersion;
    }

    private WorkGroupEngineVersion() {
        this.effectiveEngineVersion = null;
        this.selectedEngineVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupEngineVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String effectiveEngineVersion;
        private @Nullable String selectedEngineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupEngineVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveEngineVersion = defaults.effectiveEngineVersion;
    	      this.selectedEngineVersion = defaults.selectedEngineVersion;
        }

        public Builder effectiveEngineVersion(@Nullable String effectiveEngineVersion) {
            this.effectiveEngineVersion = effectiveEngineVersion;
            return this;
        }
        public Builder selectedEngineVersion(@Nullable String selectedEngineVersion) {
            this.selectedEngineVersion = selectedEngineVersion;
            return this;
        }        public WorkGroupEngineVersion build() {
            return new WorkGroupEngineVersion(effectiveEngineVersion, selectedEngineVersion);
        }
    }
}
