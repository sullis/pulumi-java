// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleConditionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleConditionGetArgs Empty = new BucketLifecycleRuleConditionGetArgs();

    /**
     * Minimum age of an object in days to satisfy this condition.
     * 
     */
    @Import(name="age")
      private final @Nullable Output<Integer> age;

    public Output<Integer> getAge() {
        return this.age == null ? Output.empty() : this.age;
    }

    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when an object is created before midnight of the specified date in UTC.
     * 
     */
    @Import(name="createdBefore")
      private final @Nullable Output<String> createdBefore;

    public Output<String> getCreatedBefore() {
        return this.createdBefore == null ? Output.empty() : this.createdBefore;
    }

    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when the customTime metadata for the object is set to an earlier date than the date used in this lifecycle condition.
     * 
     */
    @Import(name="customTimeBefore")
      private final @Nullable Output<String> customTimeBefore;

    public Output<String> getCustomTimeBefore() {
        return this.customTimeBefore == null ? Output.empty() : this.customTimeBefore;
    }

    /**
     * Days since the date set in the `customTime` metadata for the object. This condition is satisfied when the current date and time is at least the specified number of days after the `customTime`.
     * 
     */
    @Import(name="daysSinceCustomTime")
      private final @Nullable Output<Integer> daysSinceCustomTime;

    public Output<Integer> getDaysSinceCustomTime() {
        return this.daysSinceCustomTime == null ? Output.empty() : this.daysSinceCustomTime;
    }

    /**
     * Relevant only for versioned objects. Number of days elapsed since the noncurrent timestamp of an object.
     * 
     */
    @Import(name="daysSinceNoncurrentTime")
      private final @Nullable Output<Integer> daysSinceNoncurrentTime;

    public Output<Integer> getDaysSinceNoncurrentTime() {
        return this.daysSinceNoncurrentTime == null ? Output.empty() : this.daysSinceNoncurrentTime;
    }

    /**
     * [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects to satisfy this condition. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`, `DURABLE_REDUCED_AVAILABILITY`.
     * 
     */
    @Import(name="matchesStorageClasses")
      private final @Nullable Output<List<String>> matchesStorageClasses;

    public Output<List<String>> getMatchesStorageClasses() {
        return this.matchesStorageClasses == null ? Output.empty() : this.matchesStorageClasses;
    }

    /**
     * Relevant only for versioned objects. The date in RFC 3339 (e.g. `2017-06-13`) when the object became nonconcurrent.
     * 
     */
    @Import(name="noncurrentTimeBefore")
      private final @Nullable Output<String> noncurrentTimeBefore;

    public Output<String> getNoncurrentTimeBefore() {
        return this.noncurrentTimeBefore == null ? Output.empty() : this.noncurrentTimeBefore;
    }

    /**
     * Relevant only for versioned objects. The number of newer versions of an object to satisfy this condition.
     * 
     */
    @Import(name="numNewerVersions")
      private final @Nullable Output<Integer> numNewerVersions;

    public Output<Integer> getNumNewerVersions() {
        return this.numNewerVersions == null ? Output.empty() : this.numNewerVersions;
    }

    /**
     * Match to live and/or archived objects. Unversioned buckets have only live objects. Supported values include: `"LIVE"`, `"ARCHIVED"`, `"ANY"`.
     * 
     */
    @Import(name="withState")
      private final @Nullable Output<String> withState;

    public Output<String> getWithState() {
        return this.withState == null ? Output.empty() : this.withState;
    }

    public BucketLifecycleRuleConditionGetArgs(
        @Nullable Output<Integer> age,
        @Nullable Output<String> createdBefore,
        @Nullable Output<String> customTimeBefore,
        @Nullable Output<Integer> daysSinceCustomTime,
        @Nullable Output<Integer> daysSinceNoncurrentTime,
        @Nullable Output<List<String>> matchesStorageClasses,
        @Nullable Output<String> noncurrentTimeBefore,
        @Nullable Output<Integer> numNewerVersions,
        @Nullable Output<String> withState) {
        this.age = age;
        this.createdBefore = createdBefore;
        this.customTimeBefore = customTimeBefore;
        this.daysSinceCustomTime = daysSinceCustomTime;
        this.daysSinceNoncurrentTime = daysSinceNoncurrentTime;
        this.matchesStorageClasses = matchesStorageClasses;
        this.noncurrentTimeBefore = noncurrentTimeBefore;
        this.numNewerVersions = numNewerVersions;
        this.withState = withState;
    }

    private BucketLifecycleRuleConditionGetArgs() {
        this.age = Output.empty();
        this.createdBefore = Output.empty();
        this.customTimeBefore = Output.empty();
        this.daysSinceCustomTime = Output.empty();
        this.daysSinceNoncurrentTime = Output.empty();
        this.matchesStorageClasses = Output.empty();
        this.noncurrentTimeBefore = Output.empty();
        this.numNewerVersions = Output.empty();
        this.withState = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> age;
        private @Nullable Output<String> createdBefore;
        private @Nullable Output<String> customTimeBefore;
        private @Nullable Output<Integer> daysSinceCustomTime;
        private @Nullable Output<Integer> daysSinceNoncurrentTime;
        private @Nullable Output<List<String>> matchesStorageClasses;
        private @Nullable Output<String> noncurrentTimeBefore;
        private @Nullable Output<Integer> numNewerVersions;
        private @Nullable Output<String> withState;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleConditionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.age = defaults.age;
    	      this.createdBefore = defaults.createdBefore;
    	      this.customTimeBefore = defaults.customTimeBefore;
    	      this.daysSinceCustomTime = defaults.daysSinceCustomTime;
    	      this.daysSinceNoncurrentTime = defaults.daysSinceNoncurrentTime;
    	      this.matchesStorageClasses = defaults.matchesStorageClasses;
    	      this.noncurrentTimeBefore = defaults.noncurrentTimeBefore;
    	      this.numNewerVersions = defaults.numNewerVersions;
    	      this.withState = defaults.withState;
        }

        public Builder age(@Nullable Output<Integer> age) {
            this.age = age;
            return this;
        }
        public Builder age(@Nullable Integer age) {
            this.age = Output.ofNullable(age);
            return this;
        }
        public Builder createdBefore(@Nullable Output<String> createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }
        public Builder createdBefore(@Nullable String createdBefore) {
            this.createdBefore = Output.ofNullable(createdBefore);
            return this;
        }
        public Builder customTimeBefore(@Nullable Output<String> customTimeBefore) {
            this.customTimeBefore = customTimeBefore;
            return this;
        }
        public Builder customTimeBefore(@Nullable String customTimeBefore) {
            this.customTimeBefore = Output.ofNullable(customTimeBefore);
            return this;
        }
        public Builder daysSinceCustomTime(@Nullable Output<Integer> daysSinceCustomTime) {
            this.daysSinceCustomTime = daysSinceCustomTime;
            return this;
        }
        public Builder daysSinceCustomTime(@Nullable Integer daysSinceCustomTime) {
            this.daysSinceCustomTime = Output.ofNullable(daysSinceCustomTime);
            return this;
        }
        public Builder daysSinceNoncurrentTime(@Nullable Output<Integer> daysSinceNoncurrentTime) {
            this.daysSinceNoncurrentTime = daysSinceNoncurrentTime;
            return this;
        }
        public Builder daysSinceNoncurrentTime(@Nullable Integer daysSinceNoncurrentTime) {
            this.daysSinceNoncurrentTime = Output.ofNullable(daysSinceNoncurrentTime);
            return this;
        }
        public Builder matchesStorageClasses(@Nullable Output<List<String>> matchesStorageClasses) {
            this.matchesStorageClasses = matchesStorageClasses;
            return this;
        }
        public Builder matchesStorageClasses(@Nullable List<String> matchesStorageClasses) {
            this.matchesStorageClasses = Output.ofNullable(matchesStorageClasses);
            return this;
        }
        public Builder matchesStorageClasses(String... matchesStorageClasses) {
            return matchesStorageClasses(List.of(matchesStorageClasses));
        }
        public Builder noncurrentTimeBefore(@Nullable Output<String> noncurrentTimeBefore) {
            this.noncurrentTimeBefore = noncurrentTimeBefore;
            return this;
        }
        public Builder noncurrentTimeBefore(@Nullable String noncurrentTimeBefore) {
            this.noncurrentTimeBefore = Output.ofNullable(noncurrentTimeBefore);
            return this;
        }
        public Builder numNewerVersions(@Nullable Output<Integer> numNewerVersions) {
            this.numNewerVersions = numNewerVersions;
            return this;
        }
        public Builder numNewerVersions(@Nullable Integer numNewerVersions) {
            this.numNewerVersions = Output.ofNullable(numNewerVersions);
            return this;
        }
        public Builder withState(@Nullable Output<String> withState) {
            this.withState = withState;
            return this;
        }
        public Builder withState(@Nullable String withState) {
            this.withState = Output.ofNullable(withState);
            return this;
        }        public BucketLifecycleRuleConditionGetArgs build() {
            return new BucketLifecycleRuleConditionGetArgs(age, createdBefore, customTimeBefore, daysSinceCustomTime, daysSinceNoncurrentTime, matchesStorageClasses, noncurrentTimeBefore, numNewerVersions, withState);
        }
    }
}
