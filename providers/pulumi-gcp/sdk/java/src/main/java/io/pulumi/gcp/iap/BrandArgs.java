// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrandArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrandArgs Empty = new BrandArgs();

    /**
     * Application name displayed on OAuth consent screen.
     * 
     */
    @InputImport(name="applicationTitle", required=true)
    private final Input<String> applicationTitle;

    public Input<String> getApplicationTitle() {
        return this.applicationTitle;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Support email displayed on the OAuth consent screen. Can be either a
     * user or group email. When a user email is specified, the caller must
     * be the user with the associated email address. When a group email is
     * specified, the caller can be either a user or a service account which
     * is an owner of the specified group in Cloud Identity.
     * 
     */
    @InputImport(name="supportEmail", required=true)
    private final Input<String> supportEmail;

    public Input<String> getSupportEmail() {
        return this.supportEmail;
    }

    public BrandArgs(
        Input<String> applicationTitle,
        @Nullable Input<String> project,
        Input<String> supportEmail) {
        this.applicationTitle = Objects.requireNonNull(applicationTitle, "expected parameter 'applicationTitle' to be non-null");
        this.project = project;
        this.supportEmail = Objects.requireNonNull(supportEmail, "expected parameter 'supportEmail' to be non-null");
    }

    private BrandArgs() {
        this.applicationTitle = Input.empty();
        this.project = Input.empty();
        this.supportEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> applicationTitle;
        private @Nullable Input<String> project;
        private Input<String> supportEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(BrandArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationTitle = defaults.applicationTitle;
    	      this.project = defaults.project;
    	      this.supportEmail = defaults.supportEmail;
        }

        public Builder setApplicationTitle(Input<String> applicationTitle) {
            this.applicationTitle = Objects.requireNonNull(applicationTitle);
            return this;
        }

        public Builder setApplicationTitle(String applicationTitle) {
            this.applicationTitle = Input.of(Objects.requireNonNull(applicationTitle));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSupportEmail(Input<String> supportEmail) {
            this.supportEmail = Objects.requireNonNull(supportEmail);
            return this;
        }

        public Builder setSupportEmail(String supportEmail) {
            this.supportEmail = Input.of(Objects.requireNonNull(supportEmail));
            return this;
        }

        public BrandArgs build() {
            return new BrandArgs(applicationTitle, project, supportEmail);
        }
    }
}
