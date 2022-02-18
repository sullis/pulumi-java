// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.AccessReviewInstanceResponse;
import io.pulumi.azurenative.authorization.outputs.AccessReviewReviewerResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccessReviewScheduleDefinitionByIdResult {
    /**
     * The role assignment state eligible/active to review
     * 
     */
    private final String assignmentState;
    /**
     * Flag to indicate whether auto-apply capability, to automatically change the target object access resource, is enabled. If not enabled, a user must, after the review completes, apply the access review.
     * 
     */
    private final @Nullable Boolean autoApplyDecisionsEnabled;
    /**
     * This is the collection of backup reviewers.
     * 
     */
    private final @Nullable List<AccessReviewReviewerResponse> backupReviewers;
    /**
     * This specifies the behavior for the autoReview feature when an access review completes.
     * 
     */
    private final @Nullable String defaultDecision;
    /**
     * Flag to indicate whether reviewers are required to provide a justification when reviewing access.
     * 
     */
    private final @Nullable Boolean defaultDecisionEnabled;
    /**
     * The description provided by the access review creator and visible to admins.
     * 
     */
    private final @Nullable String descriptionForAdmins;
    /**
     * The description provided by the access review creator to be shown to reviewers.
     * 
     */
    private final @Nullable String descriptionForReviewers;
    /**
     * The display name for the schedule definition.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The DateTime when the review is scheduled to end. Required if type is endDate
     * 
     */
    private final @Nullable String endDate;
    /**
     * The access review schedule definition id.
     * 
     */
    private final String id;
    /**
     * Duration users are inactive for. The value should be in ISO  8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds))
     * 
     */
    private final @Nullable String inactiveDuration;
    /**
     * The duration in days for an instance.
     * 
     */
    private final @Nullable Integer instanceDurationInDays;
    /**
     * This is the collection of instances returned when one does an expand on it.
     * 
     */
    private final @Nullable List<AccessReviewInstanceResponse> instances;
    /**
     * The interval for recurrence. For a quarterly review, the interval is 3 for type : absoluteMonthly.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * Flag to indicate whether the reviewer is required to pass justification when recording a decision.
     * 
     */
    private final @Nullable Boolean justificationRequiredOnApproval;
    /**
     * Flag to indicate whether sending mails to reviewers and the review creator is enabled.
     * 
     */
    private final @Nullable Boolean mailNotificationsEnabled;
    /**
     * The access review schedule definition unique id.
     * 
     */
    private final String name;
    /**
     * The number of times to repeat the access review. Required and must be positive if type is numbered.
     * 
     */
    private final @Nullable Integer numberOfOccurrences;
    /**
     * The identity id
     * 
     */
    private final String principalId;
    /**
     * The identity display name
     * 
     */
    private final String principalName;
    /**
     * The identity type user/servicePrincipal to review
     * 
     */
    private final String principalType;
    /**
     * Flag to indicate whether showing recommendations to reviewers is enabled.
     * 
     */
    private final @Nullable Boolean recommendationsEnabled;
    /**
     * Flag to indicate whether sending reminder emails to reviewers are enabled.
     * 
     */
    private final @Nullable Boolean reminderNotificationsEnabled;
    /**
     * ResourceId in which this review is getting created
     * 
     */
    private final String resourceId;
    /**
     * This is the collection of reviewers.
     * 
     */
    private final @Nullable List<AccessReviewReviewerResponse> reviewers;
    /**
     * This field specifies the type of reviewers for a review. Usually for a review, reviewers are explicitly assigned. However, in some cases, the reviewers may not be assigned and instead be chosen dynamically. For example managers review or self review.
     * 
     */
    private final String reviewersType;
    /**
     * This is used to indicate the role being reviewed
     * 
     */
    private final String roleDefinitionId;
    /**
     * The DateTime when the review is scheduled to be start. This could be a date in the future. Required on create.
     * 
     */
    private final @Nullable String startDate;
    /**
     * This read-only field specifies the status of an accessReview.
     * 
     */
    private final String status;
    /**
     * The resource type.
     * 
     */
    private final String type;
    /**
     * The user principal name(if valid)
     * 
     */
    private final String userPrincipalName;

    @OutputCustomType.Constructor({"assignmentState","autoApplyDecisionsEnabled","backupReviewers","defaultDecision","defaultDecisionEnabled","descriptionForAdmins","descriptionForReviewers","displayName","endDate","id","inactiveDuration","instanceDurationInDays","instances","interval","justificationRequiredOnApproval","mailNotificationsEnabled","name","numberOfOccurrences","principalId","principalName","principalType","recommendationsEnabled","reminderNotificationsEnabled","resourceId","reviewers","reviewersType","roleDefinitionId","startDate","status","type","userPrincipalName"})
    private GetAccessReviewScheduleDefinitionByIdResult(
        String assignmentState,
        @Nullable Boolean autoApplyDecisionsEnabled,
        @Nullable List<AccessReviewReviewerResponse> backupReviewers,
        @Nullable String defaultDecision,
        @Nullable Boolean defaultDecisionEnabled,
        @Nullable String descriptionForAdmins,
        @Nullable String descriptionForReviewers,
        @Nullable String displayName,
        @Nullable String endDate,
        String id,
        @Nullable String inactiveDuration,
        @Nullable Integer instanceDurationInDays,
        @Nullable List<AccessReviewInstanceResponse> instances,
        @Nullable Integer interval,
        @Nullable Boolean justificationRequiredOnApproval,
        @Nullable Boolean mailNotificationsEnabled,
        String name,
        @Nullable Integer numberOfOccurrences,
        String principalId,
        String principalName,
        String principalType,
        @Nullable Boolean recommendationsEnabled,
        @Nullable Boolean reminderNotificationsEnabled,
        String resourceId,
        @Nullable List<AccessReviewReviewerResponse> reviewers,
        String reviewersType,
        String roleDefinitionId,
        @Nullable String startDate,
        String status,
        String type,
        String userPrincipalName) {
        this.assignmentState = Objects.requireNonNull(assignmentState);
        this.autoApplyDecisionsEnabled = autoApplyDecisionsEnabled;
        this.backupReviewers = backupReviewers;
        this.defaultDecision = defaultDecision;
        this.defaultDecisionEnabled = defaultDecisionEnabled;
        this.descriptionForAdmins = descriptionForAdmins;
        this.descriptionForReviewers = descriptionForReviewers;
        this.displayName = displayName;
        this.endDate = endDate;
        this.id = Objects.requireNonNull(id);
        this.inactiveDuration = inactiveDuration;
        this.instanceDurationInDays = instanceDurationInDays;
        this.instances = instances;
        this.interval = interval;
        this.justificationRequiredOnApproval = justificationRequiredOnApproval;
        this.mailNotificationsEnabled = mailNotificationsEnabled;
        this.name = Objects.requireNonNull(name);
        this.numberOfOccurrences = numberOfOccurrences;
        this.principalId = Objects.requireNonNull(principalId);
        this.principalName = Objects.requireNonNull(principalName);
        this.principalType = Objects.requireNonNull(principalType);
        this.recommendationsEnabled = recommendationsEnabled;
        this.reminderNotificationsEnabled = reminderNotificationsEnabled;
        this.resourceId = Objects.requireNonNull(resourceId);
        this.reviewers = reviewers;
        this.reviewersType = Objects.requireNonNull(reviewersType);
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
        this.startDate = startDate;
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
        this.userPrincipalName = Objects.requireNonNull(userPrincipalName);
    }

    /**
     * The role assignment state eligible/active to review
     * 
     */
    public String getAssignmentState() {
        return this.assignmentState;
    }
    /**
     * Flag to indicate whether auto-apply capability, to automatically change the target object access resource, is enabled. If not enabled, a user must, after the review completes, apply the access review.
     * 
     */
    public Optional<Boolean> getAutoApplyDecisionsEnabled() {
        return Optional.ofNullable(this.autoApplyDecisionsEnabled);
    }
    /**
     * This is the collection of backup reviewers.
     * 
     */
    public List<AccessReviewReviewerResponse> getBackupReviewers() {
        return this.backupReviewers == null ? List.of() : this.backupReviewers;
    }
    /**
     * This specifies the behavior for the autoReview feature when an access review completes.
     * 
     */
    public Optional<String> getDefaultDecision() {
        return Optional.ofNullable(this.defaultDecision);
    }
    /**
     * Flag to indicate whether reviewers are required to provide a justification when reviewing access.
     * 
     */
    public Optional<Boolean> getDefaultDecisionEnabled() {
        return Optional.ofNullable(this.defaultDecisionEnabled);
    }
    /**
     * The description provided by the access review creator and visible to admins.
     * 
     */
    public Optional<String> getDescriptionForAdmins() {
        return Optional.ofNullable(this.descriptionForAdmins);
    }
    /**
     * The description provided by the access review creator to be shown to reviewers.
     * 
     */
    public Optional<String> getDescriptionForReviewers() {
        return Optional.ofNullable(this.descriptionForReviewers);
    }
    /**
     * The display name for the schedule definition.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The DateTime when the review is scheduled to end. Required if type is endDate
     * 
     */
    public Optional<String> getEndDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * The access review schedule definition id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Duration users are inactive for. The value should be in ISO  8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds))
     * 
     */
    public Optional<String> getInactiveDuration() {
        return Optional.ofNullable(this.inactiveDuration);
    }
    /**
     * The duration in days for an instance.
     * 
     */
    public Optional<Integer> getInstanceDurationInDays() {
        return Optional.ofNullable(this.instanceDurationInDays);
    }
    /**
     * This is the collection of instances returned when one does an expand on it.
     * 
     */
    public List<AccessReviewInstanceResponse> getInstances() {
        return this.instances == null ? List.of() : this.instances;
    }
    /**
     * The interval for recurrence. For a quarterly review, the interval is 3 for type : absoluteMonthly.
     * 
     */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * Flag to indicate whether the reviewer is required to pass justification when recording a decision.
     * 
     */
    public Optional<Boolean> getJustificationRequiredOnApproval() {
        return Optional.ofNullable(this.justificationRequiredOnApproval);
    }
    /**
     * Flag to indicate whether sending mails to reviewers and the review creator is enabled.
     * 
     */
    public Optional<Boolean> getMailNotificationsEnabled() {
        return Optional.ofNullable(this.mailNotificationsEnabled);
    }
    /**
     * The access review schedule definition unique id.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The number of times to repeat the access review. Required and must be positive if type is numbered.
     * 
     */
    public Optional<Integer> getNumberOfOccurrences() {
        return Optional.ofNullable(this.numberOfOccurrences);
    }
    /**
     * The identity id
     * 
     */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The identity display name
     * 
     */
    public String getPrincipalName() {
        return this.principalName;
    }
    /**
     * The identity type user/servicePrincipal to review
     * 
     */
    public String getPrincipalType() {
        return this.principalType;
    }
    /**
     * Flag to indicate whether showing recommendations to reviewers is enabled.
     * 
     */
    public Optional<Boolean> getRecommendationsEnabled() {
        return Optional.ofNullable(this.recommendationsEnabled);
    }
    /**
     * Flag to indicate whether sending reminder emails to reviewers are enabled.
     * 
     */
    public Optional<Boolean> getReminderNotificationsEnabled() {
        return Optional.ofNullable(this.reminderNotificationsEnabled);
    }
    /**
     * ResourceId in which this review is getting created
     * 
     */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * This is the collection of reviewers.
     * 
     */
    public List<AccessReviewReviewerResponse> getReviewers() {
        return this.reviewers == null ? List.of() : this.reviewers;
    }
    /**
     * This field specifies the type of reviewers for a review. Usually for a review, reviewers are explicitly assigned. However, in some cases, the reviewers may not be assigned and instead be chosen dynamically. For example managers review or self review.
     * 
     */
    public String getReviewersType() {
        return this.reviewersType;
    }
    /**
     * This is used to indicate the role being reviewed
     * 
     */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The DateTime when the review is scheduled to be start. This could be a date in the future. Required on create.
     * 
     */
    public Optional<String> getStartDate() {
        return Optional.ofNullable(this.startDate);
    }
    /**
     * This read-only field specifies the status of an accessReview.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The user principal name(if valid)
     * 
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessReviewScheduleDefinitionByIdResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignmentState;
        private @Nullable Boolean autoApplyDecisionsEnabled;
        private @Nullable List<AccessReviewReviewerResponse> backupReviewers;
        private @Nullable String defaultDecision;
        private @Nullable Boolean defaultDecisionEnabled;
        private @Nullable String descriptionForAdmins;
        private @Nullable String descriptionForReviewers;
        private @Nullable String displayName;
        private @Nullable String endDate;
        private String id;
        private @Nullable String inactiveDuration;
        private @Nullable Integer instanceDurationInDays;
        private @Nullable List<AccessReviewInstanceResponse> instances;
        private @Nullable Integer interval;
        private @Nullable Boolean justificationRequiredOnApproval;
        private @Nullable Boolean mailNotificationsEnabled;
        private String name;
        private @Nullable Integer numberOfOccurrences;
        private String principalId;
        private String principalName;
        private String principalType;
        private @Nullable Boolean recommendationsEnabled;
        private @Nullable Boolean reminderNotificationsEnabled;
        private String resourceId;
        private @Nullable List<AccessReviewReviewerResponse> reviewers;
        private String reviewersType;
        private String roleDefinitionId;
        private @Nullable String startDate;
        private String status;
        private String type;
        private String userPrincipalName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessReviewScheduleDefinitionByIdResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentState = defaults.assignmentState;
    	      this.autoApplyDecisionsEnabled = defaults.autoApplyDecisionsEnabled;
    	      this.backupReviewers = defaults.backupReviewers;
    	      this.defaultDecision = defaults.defaultDecision;
    	      this.defaultDecisionEnabled = defaults.defaultDecisionEnabled;
    	      this.descriptionForAdmins = defaults.descriptionForAdmins;
    	      this.descriptionForReviewers = defaults.descriptionForReviewers;
    	      this.displayName = defaults.displayName;
    	      this.endDate = defaults.endDate;
    	      this.id = defaults.id;
    	      this.inactiveDuration = defaults.inactiveDuration;
    	      this.instanceDurationInDays = defaults.instanceDurationInDays;
    	      this.instances = defaults.instances;
    	      this.interval = defaults.interval;
    	      this.justificationRequiredOnApproval = defaults.justificationRequiredOnApproval;
    	      this.mailNotificationsEnabled = defaults.mailNotificationsEnabled;
    	      this.name = defaults.name;
    	      this.numberOfOccurrences = defaults.numberOfOccurrences;
    	      this.principalId = defaults.principalId;
    	      this.principalName = defaults.principalName;
    	      this.principalType = defaults.principalType;
    	      this.recommendationsEnabled = defaults.recommendationsEnabled;
    	      this.reminderNotificationsEnabled = defaults.reminderNotificationsEnabled;
    	      this.resourceId = defaults.resourceId;
    	      this.reviewers = defaults.reviewers;
    	      this.reviewersType = defaults.reviewersType;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.startDate = defaults.startDate;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.userPrincipalName = defaults.userPrincipalName;
        }

        public Builder setAssignmentState(String assignmentState) {
            this.assignmentState = Objects.requireNonNull(assignmentState);
            return this;
        }

        public Builder setAutoApplyDecisionsEnabled(@Nullable Boolean autoApplyDecisionsEnabled) {
            this.autoApplyDecisionsEnabled = autoApplyDecisionsEnabled;
            return this;
        }

        public Builder setBackupReviewers(@Nullable List<AccessReviewReviewerResponse> backupReviewers) {
            this.backupReviewers = backupReviewers;
            return this;
        }

        public Builder setDefaultDecision(@Nullable String defaultDecision) {
            this.defaultDecision = defaultDecision;
            return this;
        }

        public Builder setDefaultDecisionEnabled(@Nullable Boolean defaultDecisionEnabled) {
            this.defaultDecisionEnabled = defaultDecisionEnabled;
            return this;
        }

        public Builder setDescriptionForAdmins(@Nullable String descriptionForAdmins) {
            this.descriptionForAdmins = descriptionForAdmins;
            return this;
        }

        public Builder setDescriptionForReviewers(@Nullable String descriptionForReviewers) {
            this.descriptionForReviewers = descriptionForReviewers;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEndDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInactiveDuration(@Nullable String inactiveDuration) {
            this.inactiveDuration = inactiveDuration;
            return this;
        }

        public Builder setInstanceDurationInDays(@Nullable Integer instanceDurationInDays) {
            this.instanceDurationInDays = instanceDurationInDays;
            return this;
        }

        public Builder setInstances(@Nullable List<AccessReviewInstanceResponse> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setJustificationRequiredOnApproval(@Nullable Boolean justificationRequiredOnApproval) {
            this.justificationRequiredOnApproval = justificationRequiredOnApproval;
            return this;
        }

        public Builder setMailNotificationsEnabled(@Nullable Boolean mailNotificationsEnabled) {
            this.mailNotificationsEnabled = mailNotificationsEnabled;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNumberOfOccurrences(@Nullable Integer numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalName(String principalName) {
            this.principalName = Objects.requireNonNull(principalName);
            return this;
        }

        public Builder setPrincipalType(String principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }

        public Builder setRecommendationsEnabled(@Nullable Boolean recommendationsEnabled) {
            this.recommendationsEnabled = recommendationsEnabled;
            return this;
        }

        public Builder setReminderNotificationsEnabled(@Nullable Boolean reminderNotificationsEnabled) {
            this.reminderNotificationsEnabled = reminderNotificationsEnabled;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setReviewers(@Nullable List<AccessReviewReviewerResponse> reviewers) {
            this.reviewers = reviewers;
            return this;
        }

        public Builder setReviewersType(String reviewersType) {
            this.reviewersType = Objects.requireNonNull(reviewersType);
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }

        public Builder setStartDate(@Nullable String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = Objects.requireNonNull(userPrincipalName);
            return this;
        }

        public GetAccessReviewScheduleDefinitionByIdResult build() {
            return new GetAccessReviewScheduleDefinitionByIdResult(assignmentState, autoApplyDecisionsEnabled, backupReviewers, defaultDecision, defaultDecisionEnabled, descriptionForAdmins, descriptionForReviewers, displayName, endDate, id, inactiveDuration, instanceDurationInDays, instances, interval, justificationRequiredOnApproval, mailNotificationsEnabled, name, numberOfOccurrences, principalId, principalName, principalType, recommendationsEnabled, reminderNotificationsEnabled, resourceId, reviewers, reviewersType, roleDefinitionId, startDate, status, type, userPrincipalName);
        }
    }
}
