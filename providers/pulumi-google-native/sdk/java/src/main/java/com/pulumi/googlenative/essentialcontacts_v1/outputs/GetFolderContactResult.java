// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.essentialcontacts_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFolderContactResult {
    /**
     * @return The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    private final String email;
    /**
     * @return The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
     * 
     */
    private final String languageTag;
    /**
     * @return The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
     * 
     */
    private final String name;
    /**
     * @return The categories of notifications that the contact will receive communications for.
     * 
     */
    private final List<String> notificationCategorySubscriptions;
    /**
     * @return The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
     * 
     */
    private final String validateTime;
    /**
     * @return The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    private final String validationState;

    @CustomType.Constructor
    private GetFolderContactResult(
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("languageTag") String languageTag,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notificationCategorySubscriptions") List<String> notificationCategorySubscriptions,
        @CustomType.Parameter("validateTime") String validateTime,
        @CustomType.Parameter("validationState") String validationState) {
        this.email = email;
        this.languageTag = languageTag;
        this.name = name;
        this.notificationCategorySubscriptions = notificationCategorySubscriptions;
        this.validateTime = validateTime;
        this.validationState = validationState;
    }

    /**
     * @return The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
     * 
     */
    public String languageTag() {
        return this.languageTag;
    }
    /**
     * @return The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The categories of notifications that the contact will receive communications for.
     * 
     */
    public List<String> notificationCategorySubscriptions() {
        return this.notificationCategorySubscriptions;
    }
    /**
     * @return The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
     * 
     */
    public String validateTime() {
        return this.validateTime;
    }
    /**
     * @return The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    public String validationState() {
        return this.validationState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderContactResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String languageTag;
        private String name;
        private List<String> notificationCategorySubscriptions;
        private String validateTime;
        private String validationState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderContactResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.languageTag = defaults.languageTag;
    	      this.name = defaults.name;
    	      this.notificationCategorySubscriptions = defaults.notificationCategorySubscriptions;
    	      this.validateTime = defaults.validateTime;
    	      this.validationState = defaults.validationState;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder languageTag(String languageTag) {
            this.languageTag = Objects.requireNonNull(languageTag);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notificationCategorySubscriptions(List<String> notificationCategorySubscriptions) {
            this.notificationCategorySubscriptions = Objects.requireNonNull(notificationCategorySubscriptions);
            return this;
        }
        public Builder notificationCategorySubscriptions(String... notificationCategorySubscriptions) {
            return notificationCategorySubscriptions(List.of(notificationCategorySubscriptions));
        }
        public Builder validateTime(String validateTime) {
            this.validateTime = Objects.requireNonNull(validateTime);
            return this;
        }
        public Builder validationState(String validationState) {
            this.validationState = Objects.requireNonNull(validationState);
            return this;
        }        public GetFolderContactResult build() {
            return new GetFolderContactResult(email, languageTag, name, notificationCategorySubscriptions, validateTime, validationState);
        }
    }
}
