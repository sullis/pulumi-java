// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppDeploymentSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppDeploymentSlotArgs Empty = new WebAppDeploymentSlotArgs();

    /**
     * True if deployment is currently active, false if completed and null if not started.
     * 
     */
    @InputImport(name="active")
    private final @Nullable Input<Boolean> active;

    public Input<Boolean> getActive() {
        return this.active == null ? Input.empty() : this.active;
    }

    /**
     * Who authored the deployment.
     * 
     */
    @InputImport(name="author")
    private final @Nullable Input<String> author;

    public Input<String> getAuthor() {
        return this.author == null ? Input.empty() : this.author;
    }

    /**
     * Author email.
     * 
     */
    @InputImport(name="authorEmail")
    private final @Nullable Input<String> authorEmail;

    public Input<String> getAuthorEmail() {
        return this.authorEmail == null ? Input.empty() : this.authorEmail;
    }

    /**
     * Who performed the deployment.
     * 
     */
    @InputImport(name="deployer")
    private final @Nullable Input<String> deployer;

    public Input<String> getDeployer() {
        return this.deployer == null ? Input.empty() : this.deployer;
    }

    /**
     * Details on deployment.
     * 
     */
    @InputImport(name="details")
    private final @Nullable Input<String> details;

    public Input<String> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    /**
     * End time.
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * ID of an existing deployment.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Details about deployment status.
     * 
     */
    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API creates a deployment for the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
    private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    /**
     * Start time.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Deployment status.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<Integer> status;

    public Input<Integer> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public WebAppDeploymentSlotArgs(
        @Nullable Input<Boolean> active,
        @Nullable Input<String> author,
        @Nullable Input<String> authorEmail,
        @Nullable Input<String> deployer,
        @Nullable Input<String> details,
        @Nullable Input<String> endTime,
        @Nullable Input<String> id,
        @Nullable Input<String> kind,
        @Nullable Input<String> message,
        Input<String> name,
        Input<String> resourceGroupName,
        Input<String> slot,
        @Nullable Input<String> startTime,
        @Nullable Input<Integer> status) {
        this.active = active;
        this.author = author;
        this.authorEmail = authorEmail;
        this.deployer = deployer;
        this.details = details;
        this.endTime = endTime;
        this.id = id;
        this.kind = kind;
        this.message = message;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.startTime = startTime;
        this.status = status;
    }

    private WebAppDeploymentSlotArgs() {
        this.active = Input.empty();
        this.author = Input.empty();
        this.authorEmail = Input.empty();
        this.deployer = Input.empty();
        this.details = Input.empty();
        this.endTime = Input.empty();
        this.id = Input.empty();
        this.kind = Input.empty();
        this.message = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.slot = Input.empty();
        this.startTime = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppDeploymentSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> active;
        private @Nullable Input<String> author;
        private @Nullable Input<String> authorEmail;
        private @Nullable Input<String> deployer;
        private @Nullable Input<String> details;
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> id;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> message;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private Input<String> slot;
        private @Nullable Input<String> startTime;
        private @Nullable Input<Integer> status;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppDeploymentSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.author = defaults.author;
    	      this.authorEmail = defaults.authorEmail;
    	      this.deployer = defaults.deployer;
    	      this.details = defaults.details;
    	      this.endTime = defaults.endTime;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder setActive(@Nullable Input<Boolean> active) {
            this.active = active;
            return this;
        }

        public Builder setActive(@Nullable Boolean active) {
            this.active = Input.ofNullable(active);
            return this;
        }

        public Builder setAuthor(@Nullable Input<String> author) {
            this.author = author;
            return this;
        }

        public Builder setAuthor(@Nullable String author) {
            this.author = Input.ofNullable(author);
            return this;
        }

        public Builder setAuthorEmail(@Nullable Input<String> authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }

        public Builder setAuthorEmail(@Nullable String authorEmail) {
            this.authorEmail = Input.ofNullable(authorEmail);
            return this;
        }

        public Builder setDeployer(@Nullable Input<String> deployer) {
            this.deployer = deployer;
            return this;
        }

        public Builder setDeployer(@Nullable String deployer) {
            this.deployer = Input.ofNullable(deployer);
            return this;
        }

        public Builder setDetails(@Nullable Input<String> details) {
            this.details = details;
            return this;
        }

        public Builder setDetails(@Nullable String details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSlot(Input<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Input.of(Objects.requireNonNull(slot));
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setStatus(@Nullable Input<Integer> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Integer status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public WebAppDeploymentSlotArgs build() {
            return new WebAppDeploymentSlotArgs(active, author, authorEmail, deployer, details, endTime, id, kind, message, name, resourceGroupName, slot, startTime, status);
        }
    }
}
