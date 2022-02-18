// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ObjectReference;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CronJobStatus {
    /**
     * A list of pointers to currently running jobs.
     * 
     */
    private final @Nullable List<ObjectReference> active;
    /**
     * Information when was the last time the job was successfully scheduled.
     * 
     */
    private final @Nullable String lastScheduleTime;
    /**
     * Information when was the last time the job successfully completed.
     * 
     */
    private final @Nullable String lastSuccessfulTime;

    @OutputCustomType.Constructor({"active","lastScheduleTime","lastSuccessfulTime"})
    private CronJobStatus(
        @Nullable List<ObjectReference> active,
        @Nullable String lastScheduleTime,
        @Nullable String lastSuccessfulTime) {
        this.active = active;
        this.lastScheduleTime = lastScheduleTime;
        this.lastSuccessfulTime = lastSuccessfulTime;
    }

    /**
     * A list of pointers to currently running jobs.
     * 
     */
    public List<ObjectReference> getActive() {
        return this.active == null ? List.of() : this.active;
    }
    /**
     * Information when was the last time the job was successfully scheduled.
     * 
     */
    public Optional<String> getLastScheduleTime() {
        return Optional.ofNullable(this.lastScheduleTime);
    }
    /**
     * Information when was the last time the job successfully completed.
     * 
     */
    public Optional<String> getLastSuccessfulTime() {
        return Optional.ofNullable(this.lastSuccessfulTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ObjectReference> active;
        private @Nullable String lastScheduleTime;
        private @Nullable String lastSuccessfulTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CronJobStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.lastScheduleTime = defaults.lastScheduleTime;
    	      this.lastSuccessfulTime = defaults.lastSuccessfulTime;
        }

        public Builder setActive(@Nullable List<ObjectReference> active) {
            this.active = active;
            return this;
        }

        public Builder setLastScheduleTime(@Nullable String lastScheduleTime) {
            this.lastScheduleTime = lastScheduleTime;
            return this;
        }

        public Builder setLastSuccessfulTime(@Nullable String lastSuccessfulTime) {
            this.lastSuccessfulTime = lastSuccessfulTime;
            return this;
        }

        public CronJobStatus build() {
            return new CronJobStatus(active, lastScheduleTime, lastSuccessfulTime);
        }
    }
}
