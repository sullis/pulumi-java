// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleConditionArgs Empty = new BucketLifecycleRuleConditionArgs();

    /**
     * Minimum age of an object in days to satisfy this condition.
     * 
     */
    @InputImport(name="age")
      private final @Nullable Input<Integer> age;

    public Input<Integer> getAge() {
        return this.age == null ? Input.empty() : this.age;
    }

    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when an object is created before midnight of the specified date in UTC.
     * 
     */
    @InputImport(name="createdBefore")
      private final @Nullable Input<String> createdBefore;

    public Input<String> getCreatedBefore() {
        return this.createdBefore == null ? Input.empty() : this.createdBefore;
    }

    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when the customTime metadata for the object is set to an earlier date than the date used in this lifecycle condition.
     * 
     */
    @InputImport(name="customTimeBefore")
      private final @Nullable Input<String> customTimeBefore;

    public Input<String> getCustomTimeBefore() {
        return this.customTimeBefore == null ? Input.empty() : this.customTimeBefore;
    }

    /**
     * Days since the date set in the `customTime` metadata for the object. This condition is satisfied when the current date and time is at least the specified number of days after the `customTime`.
     * 
     */
    @InputImport(name="daysSinceCustomTime")
      private final @Nullable Input<Integer> daysSinceCustomTime;

    public Input<Integer> getDaysSinceCustomTime() {
        return this.daysSinceCustomTime == null ? Input.empty() : this.daysSinceCustomTime;
    }

    /**
     * Relevant only for versioned objects. Number of days elapsed since the noncurrent timestamp of an object.
     * 
     */
    @InputImport(name="daysSinceNoncurrentTime")
      private final @Nullable Input<Integer> daysSinceNoncurrentTime;

    public Input<Integer> getDaysSinceNoncurrentTime() {
        return this.daysSinceNoncurrentTime == null ? Input.empty() : this.daysSinceNoncurrentTime;
    }

    /**
     * [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects to satisfy this condition. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`, `DURABLE_REDUCED_AVAILABILITY`.
     * 
     */
    @InputImport(name="matchesStorageClasses")
      private final @Nullable Input<List<String>> matchesStorageClasses;

    public Input<List<String>> getMatchesStorageClasses() {
        return this.matchesStorageClasses == null ? Input.empty() : this.matchesStorageClasses;
    }

    /**
     * Relevant only for versioned objects. The date in RFC 3339 (e.g. `2017-06-13`) when the object became nonconcurrent.
     * 
     */
    @InputImport(name="noncurrentTimeBefore")
      private final @Nullable Input<String> noncurrentTimeBefore;

    public Input<String> getNoncurrentTimeBefore() {
        return this.noncurrentTimeBefore == null ? Input.empty() : this.noncurrentTimeBefore;
    }

    /**
     * Relevant only for versioned objects. The number of newer versions of an object to satisfy this condition.
     * 
     */
    @InputImport(name="numNewerVersions")
      private final @Nullable Input<Integer> numNewerVersions;

    public Input<Integer> getNumNewerVersions() {
        return this.numNewerVersions == null ? Input.empty() : this.numNewerVersions;
    }

    /**
     * Match to live and/or archived objects. Unversioned buckets have only live objects. Supported values include: `"LIVE"`, `"ARCHIVED"`, `"ANY"`.
     * 
     */
    @InputImport(name="withState")
      private final @Nullable Input<String> withState;

    public Input<String> getWithState() {
        return this.withState == null ? Input.empty() : this.withState;
    }

    public BucketLifecycleRuleConditionArgs(
        @Nullable Input<Integer> age,
        @Nullable Input<String> createdBefore,
        @Nullable Input<String> customTimeBefore,
        @Nullable Input<Integer> daysSinceCustomTime,
        @Nullable Input<Integer> daysSinceNoncurrentTime,
        @Nullable Input<List<String>> matchesStorageClasses,
        @Nullable Input<String> noncurrentTimeBefore,
        @Nullable Input<Integer> numNewerVersions,
        @Nullable Input<String> withState) {
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

    private BucketLifecycleRuleConditionArgs() {
        this.age = Input.empty();
        this.createdBefore = Input.empty();
        this.customTimeBefore = Input.empty();
        this.daysSinceCustomTime = Input.empty();
        this.daysSinceNoncurrentTime = Input.empty();
        this.matchesStorageClasses = Input.empty();
        this.noncurrentTimeBefore = Input.empty();
        this.numNewerVersions = Input.empty();
        this.withState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> age;
        private @Nullable Input<String> createdBefore;
        private @Nullable Input<String> customTimeBefore;
        private @Nullable Input<Integer> daysSinceCustomTime;
        private @Nullable Input<Integer> daysSinceNoncurrentTime;
        private @Nullable Input<List<String>> matchesStorageClasses;
        private @Nullable Input<String> noncurrentTimeBefore;
        private @Nullable Input<Integer> numNewerVersions;
        private @Nullable Input<String> withState;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleConditionArgs defaults) {
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

        public Builder setAge(@Nullable Input<Integer> age) {
            this.age = age;
            return this;
        }

        public Builder setAge(@Nullable Integer age) {
            this.age = Input.ofNullable(age);
            return this;
        }

        public Builder setCreatedBefore(@Nullable Input<String> createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }

        public Builder setCreatedBefore(@Nullable String createdBefore) {
            this.createdBefore = Input.ofNullable(createdBefore);
            return this;
        }

        public Builder setCustomTimeBefore(@Nullable Input<String> customTimeBefore) {
            this.customTimeBefore = customTimeBefore;
            return this;
        }

        public Builder setCustomTimeBefore(@Nullable String customTimeBefore) {
            this.customTimeBefore = Input.ofNullable(customTimeBefore);
            return this;
        }

        public Builder setDaysSinceCustomTime(@Nullable Input<Integer> daysSinceCustomTime) {
            this.daysSinceCustomTime = daysSinceCustomTime;
            return this;
        }

        public Builder setDaysSinceCustomTime(@Nullable Integer daysSinceCustomTime) {
            this.daysSinceCustomTime = Input.ofNullable(daysSinceCustomTime);
            return this;
        }

        public Builder setDaysSinceNoncurrentTime(@Nullable Input<Integer> daysSinceNoncurrentTime) {
            this.daysSinceNoncurrentTime = daysSinceNoncurrentTime;
            return this;
        }

        public Builder setDaysSinceNoncurrentTime(@Nullable Integer daysSinceNoncurrentTime) {
            this.daysSinceNoncurrentTime = Input.ofNullable(daysSinceNoncurrentTime);
            return this;
        }

        public Builder setMatchesStorageClasses(@Nullable Input<List<String>> matchesStorageClasses) {
            this.matchesStorageClasses = matchesStorageClasses;
            return this;
        }

        public Builder setMatchesStorageClasses(@Nullable List<String> matchesStorageClasses) {
            this.matchesStorageClasses = Input.ofNullable(matchesStorageClasses);
            return this;
        }

        public Builder setNoncurrentTimeBefore(@Nullable Input<String> noncurrentTimeBefore) {
            this.noncurrentTimeBefore = noncurrentTimeBefore;
            return this;
        }

        public Builder setNoncurrentTimeBefore(@Nullable String noncurrentTimeBefore) {
            this.noncurrentTimeBefore = Input.ofNullable(noncurrentTimeBefore);
            return this;
        }

        public Builder setNumNewerVersions(@Nullable Input<Integer> numNewerVersions) {
            this.numNewerVersions = numNewerVersions;
            return this;
        }

        public Builder setNumNewerVersions(@Nullable Integer numNewerVersions) {
            this.numNewerVersions = Input.ofNullable(numNewerVersions);
            return this;
        }

        public Builder setWithState(@Nullable Input<String> withState) {
            this.withState = withState;
            return this;
        }

        public Builder setWithState(@Nullable String withState) {
            this.withState = Input.ofNullable(withState);
            return this;
        }
        public BucketLifecycleRuleConditionArgs build() {
            return new BucketLifecycleRuleConditionArgs(age, createdBefore, customTimeBefore, daysSinceCustomTime, daysSinceNoncurrentTime, matchesStorageClasses, noncurrentTimeBefore, numNewerVersions, withState);
        }
    }
}