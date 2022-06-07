// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPermissionSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPermissionSetArgs Empty = new GetPermissionSetArgs();

    /**
     * The Amazon Resource Name (ARN) of the permission set.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the permission set.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance associated with the permission set.
     * 
     */
    @Import(name="instanceArn", required=true)
    private Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance associated with the permission set.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The name of the SSO Permission Set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the SSO Permission Set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Key-value map of resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetPermissionSetArgs() {}

    private GetPermissionSetArgs(GetPermissionSetArgs $) {
        this.arn = $.arn;
        this.instanceArn = $.instanceArn;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPermissionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPermissionSetArgs $;

        public Builder() {
            $ = new GetPermissionSetArgs();
        }

        public Builder(GetPermissionSetArgs defaults) {
            $ = new GetPermissionSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the permission set.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the permission set.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance associated with the permission set.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance associated with the permission set.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        /**
         * @param name The name of the SSO Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SSO Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Key-value map of resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetPermissionSetArgs build() {
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            return $;
        }
    }

}
