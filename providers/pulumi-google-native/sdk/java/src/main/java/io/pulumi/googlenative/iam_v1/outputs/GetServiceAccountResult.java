// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServiceAccountResult {
    /**
     * Optional. A user-specified, human-readable description of the service account. The maximum length is 256 UTF-8 bytes.
     * 
     */
    private final String description;
    /**
     * Whether the service account is disabled.
     * 
     */
    private final Boolean disabled;
    /**
     * Optional. A user-specified, human-readable name for the service account. The maximum length is 100 UTF-8 bytes.
     * 
     */
    private final String displayName;
    /**
     * The email address of the service account.
     * 
     */
    private final String email;
    /**
     * The resource name of the service account. Use one of the following formats: * `projects/{PROJECT_ID}/serviceAccounts/{EMAIL_ADDRESS}` * `projects/{PROJECT_ID}/serviceAccounts/{UNIQUE_ID}` As an alternative, you can use the `-` wildcard character instead of the project ID: * `projects/-/serviceAccounts/{EMAIL_ADDRESS}` * `projects/-/serviceAccounts/{UNIQUE_ID}` When possible, avoid using the `-` wildcard character, because it can cause response messages to contain misleading error codes. For example, if you try to get the service account `projects/-/serviceAccounts/fake@example.com`, which does not exist, the response contains an HTTP `403 Forbidden` error instead of a `404 Not Found` error.
     * 
     */
    private final String name;
    /**
     * The OAuth 2.0 client ID for the service account.
     * 
     */
    private final String oauth2ClientId;
    /**
     * The ID of the project that owns the service account.
     * 
     */
    private final String project;
    /**
     * The unique, stable numeric ID for the service account. Each service account retains its unique ID even if you delete the service account. For example, if you delete a service account, then create a new service account with the same name, the new service account has a different unique ID than the deleted service account.
     * 
     */
    private final String uniqueId;

    @OutputCustomType.Constructor({"description","disabled","displayName","email","name","oauth2ClientId","project","uniqueId"})
    private GetServiceAccountResult(
        String description,
        Boolean disabled,
        String displayName,
        String email,
        String name,
        String oauth2ClientId,
        String project,
        String uniqueId) {
        this.description = Objects.requireNonNull(description);
        this.disabled = Objects.requireNonNull(disabled);
        this.displayName = Objects.requireNonNull(displayName);
        this.email = Objects.requireNonNull(email);
        this.name = Objects.requireNonNull(name);
        this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
        this.project = Objects.requireNonNull(project);
        this.uniqueId = Objects.requireNonNull(uniqueId);
    }

    /**
     * Optional. A user-specified, human-readable description of the service account. The maximum length is 256 UTF-8 bytes.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Whether the service account is disabled.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }
    /**
     * Optional. A user-specified, human-readable name for the service account. The maximum length is 100 UTF-8 bytes.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The email address of the service account.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The resource name of the service account. Use one of the following formats: * `projects/{PROJECT_ID}/serviceAccounts/{EMAIL_ADDRESS}` * `projects/{PROJECT_ID}/serviceAccounts/{UNIQUE_ID}` As an alternative, you can use the `-` wildcard character instead of the project ID: * `projects/-/serviceAccounts/{EMAIL_ADDRESS}` * `projects/-/serviceAccounts/{UNIQUE_ID}` When possible, avoid using the `-` wildcard character, because it can cause response messages to contain misleading error codes. For example, if you try to get the service account `projects/-/serviceAccounts/fake@example.com`, which does not exist, the response contains an HTTP `403 Forbidden` error instead of a `404 Not Found` error.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The OAuth 2.0 client ID for the service account.
     * 
    */
    public String getOauth2ClientId() {
        return this.oauth2ClientId;
    }
    /**
     * The ID of the project that owns the service account.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * The unique, stable numeric ID for the service account. Each service account retains its unique ID even if you delete the service account. For example, if you delete a service account, then create a new service account with the same name, the new service account has a different unique ID than the deleted service account.
     * 
    */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private Boolean disabled;
        private String displayName;
        private String email;
        private String name;
        private String oauth2ClientId;
        private String project;
        private String uniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.name = defaults.name;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.project = defaults.project;
    	      this.uniqueId = defaults.uniqueId;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setUniqueId(String uniqueId) {
            this.uniqueId = Objects.requireNonNull(uniqueId);
            return this;
        }
        public GetServiceAccountResult build() {
            return new GetServiceAccountResult(description, disabled, displayName, email, name, oauth2ClientId, project, uniqueId);
        }
    }
}