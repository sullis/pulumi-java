// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The condition(s) under which the action will be taken.
 * 
 */
public final class BucketLifecycleRuleItemConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final BucketLifecycleRuleItemConditionResponse Empty = new BucketLifecycleRuleItemConditionResponse();

    /**
     * Age of an object (in days). This condition is satisfied when an object reaches the specified age.
     * 
     */
    @InputImport(name="age", required=true)
      private final Integer age;

    public Integer getAge() {
        return this.age;
    }

    /**
     * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when an object is created before midnight of the specified date in UTC.
     * 
     */
    @InputImport(name="createdBefore", required=true)
      private final String createdBefore;

    public String getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when the custom time on an object is before this date in UTC.
     * 
     */
    @InputImport(name="customTimeBefore", required=true)
      private final String customTimeBefore;

    public String getCustomTimeBefore() {
        return this.customTimeBefore;
    }

    /**
     * Number of days elapsed since the user-specified timestamp set on an object. The condition is satisfied if the days elapsed is at least this number. If no custom timestamp is specified on an object, the condition does not apply.
     * 
     */
    @InputImport(name="daysSinceCustomTime", required=true)
      private final Integer daysSinceCustomTime;

    public Integer getDaysSinceCustomTime() {
        return this.daysSinceCustomTime;
    }

    /**
     * Number of days elapsed since the noncurrent timestamp of an object. The condition is satisfied if the days elapsed is at least this number. This condition is relevant only for versioned objects. The value of the field must be a nonnegative integer. If it's zero, the object version will become eligible for Lifecycle action as soon as it becomes noncurrent.
     * 
     */
    @InputImport(name="daysSinceNoncurrentTime", required=true)
      private final Integer daysSinceNoncurrentTime;

    public Integer getDaysSinceNoncurrentTime() {
        return this.daysSinceNoncurrentTime;
    }

    /**
     * Relevant only for versioned objects. If the value is true, this condition matches live objects; if the value is false, it matches archived objects.
     * 
     */
    @InputImport(name="isLive", required=true)
      private final Boolean isLive;

    public Boolean getIsLive() {
        return this.isLive;
    }

    /**
     * A regular expression that satisfies the RE2 syntax. This condition is satisfied when the name of the object matches the RE2 pattern. Note: This feature is currently in the "Early Access" launch stage and is only available to a whitelisted set of users; that means that this feature may be changed in backward-incompatible ways and that it is not guaranteed to be released.
     * 
     */
    @InputImport(name="matchesPattern", required=true)
      private final String matchesPattern;

    public String getMatchesPattern() {
        return this.matchesPattern;
    }

    /**
     * Objects having any of the storage classes specified by this condition will be matched. Values include MULTI_REGIONAL, REGIONAL, NEARLINE, COLDLINE, ARCHIVE, STANDARD, and DURABLE_REDUCED_AVAILABILITY.
     * 
     */
    @InputImport(name="matchesStorageClass", required=true)
      private final List<String> matchesStorageClass;

    public List<String> getMatchesStorageClass() {
        return this.matchesStorageClass;
    }

    /**
     * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when the noncurrent time on an object is before this date in UTC. This condition is relevant only for versioned objects.
     * 
     */
    @InputImport(name="noncurrentTimeBefore", required=true)
      private final String noncurrentTimeBefore;

    public String getNoncurrentTimeBefore() {
        return this.noncurrentTimeBefore;
    }

    /**
     * Relevant only for versioned objects. If the value is N, this condition is satisfied when there are at least N versions (including the live version) newer than this version of the object.
     * 
     */
    @InputImport(name="numNewerVersions", required=true)
      private final Integer numNewerVersions;

    public Integer getNumNewerVersions() {
        return this.numNewerVersions;
    }

    public BucketLifecycleRuleItemConditionResponse(
        Integer age,
        String createdBefore,
        String customTimeBefore,
        Integer daysSinceCustomTime,
        Integer daysSinceNoncurrentTime,
        Boolean isLive,
        String matchesPattern,
        List<String> matchesStorageClass,
        String noncurrentTimeBefore,
        Integer numNewerVersions) {
        this.age = Objects.requireNonNull(age, "expected parameter 'age' to be non-null");
        this.createdBefore = Objects.requireNonNull(createdBefore, "expected parameter 'createdBefore' to be non-null");
        this.customTimeBefore = Objects.requireNonNull(customTimeBefore, "expected parameter 'customTimeBefore' to be non-null");
        this.daysSinceCustomTime = Objects.requireNonNull(daysSinceCustomTime, "expected parameter 'daysSinceCustomTime' to be non-null");
        this.daysSinceNoncurrentTime = Objects.requireNonNull(daysSinceNoncurrentTime, "expected parameter 'daysSinceNoncurrentTime' to be non-null");
        this.isLive = Objects.requireNonNull(isLive, "expected parameter 'isLive' to be non-null");
        this.matchesPattern = Objects.requireNonNull(matchesPattern, "expected parameter 'matchesPattern' to be non-null");
        this.matchesStorageClass = Objects.requireNonNull(matchesStorageClass, "expected parameter 'matchesStorageClass' to be non-null");
        this.noncurrentTimeBefore = Objects.requireNonNull(noncurrentTimeBefore, "expected parameter 'noncurrentTimeBefore' to be non-null");
        this.numNewerVersions = Objects.requireNonNull(numNewerVersions, "expected parameter 'numNewerVersions' to be non-null");
    }

    private BucketLifecycleRuleItemConditionResponse() {
        this.age = null;
        this.createdBefore = null;
        this.customTimeBefore = null;
        this.daysSinceCustomTime = null;
        this.daysSinceNoncurrentTime = null;
        this.isLive = null;
        this.matchesPattern = null;
        this.matchesStorageClass = List.of();
        this.noncurrentTimeBefore = null;
        this.numNewerVersions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleItemConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer age;
        private String createdBefore;
        private String customTimeBefore;
        private Integer daysSinceCustomTime;
        private Integer daysSinceNoncurrentTime;
        private Boolean isLive;
        private String matchesPattern;
        private List<String> matchesStorageClass;
        private String noncurrentTimeBefore;
        private Integer numNewerVersions;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleItemConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.age = defaults.age;
    	      this.createdBefore = defaults.createdBefore;
    	      this.customTimeBefore = defaults.customTimeBefore;
    	      this.daysSinceCustomTime = defaults.daysSinceCustomTime;
    	      this.daysSinceNoncurrentTime = defaults.daysSinceNoncurrentTime;
    	      this.isLive = defaults.isLive;
    	      this.matchesPattern = defaults.matchesPattern;
    	      this.matchesStorageClass = defaults.matchesStorageClass;
    	      this.noncurrentTimeBefore = defaults.noncurrentTimeBefore;
    	      this.numNewerVersions = defaults.numNewerVersions;
        }

        public Builder setAge(Integer age) {
            this.age = Objects.requireNonNull(age);
            return this;
        }

        public Builder setCreatedBefore(String createdBefore) {
            this.createdBefore = Objects.requireNonNull(createdBefore);
            return this;
        }

        public Builder setCustomTimeBefore(String customTimeBefore) {
            this.customTimeBefore = Objects.requireNonNull(customTimeBefore);
            return this;
        }

        public Builder setDaysSinceCustomTime(Integer daysSinceCustomTime) {
            this.daysSinceCustomTime = Objects.requireNonNull(daysSinceCustomTime);
            return this;
        }

        public Builder setDaysSinceNoncurrentTime(Integer daysSinceNoncurrentTime) {
            this.daysSinceNoncurrentTime = Objects.requireNonNull(daysSinceNoncurrentTime);
            return this;
        }

        public Builder setIsLive(Boolean isLive) {
            this.isLive = Objects.requireNonNull(isLive);
            return this;
        }

        public Builder setMatchesPattern(String matchesPattern) {
            this.matchesPattern = Objects.requireNonNull(matchesPattern);
            return this;
        }

        public Builder setMatchesStorageClass(List<String> matchesStorageClass) {
            this.matchesStorageClass = Objects.requireNonNull(matchesStorageClass);
            return this;
        }

        public Builder setNoncurrentTimeBefore(String noncurrentTimeBefore) {
            this.noncurrentTimeBefore = Objects.requireNonNull(noncurrentTimeBefore);
            return this;
        }

        public Builder setNumNewerVersions(Integer numNewerVersions) {
            this.numNewerVersions = Objects.requireNonNull(numNewerVersions);
            return this;
        }
        public BucketLifecycleRuleItemConditionResponse build() {
            return new BucketLifecycleRuleItemConditionResponse(age, createdBefore, customTimeBefore, daysSinceCustomTime, daysSinceNoncurrentTime, isLive, matchesPattern, matchesStorageClass, noncurrentTimeBefore, numNewerVersions);
        }
    }
}