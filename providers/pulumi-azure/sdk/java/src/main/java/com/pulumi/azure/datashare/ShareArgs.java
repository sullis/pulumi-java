// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datashare;

import com.pulumi.azure.datashare.inputs.ShareSnapshotScheduleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShareArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShareArgs Empty = new ShareArgs();

    /**
     * The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The Data Share&#39;s description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Data Share&#39;s description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `snapshot_schedule` block as defined below.
     * 
     */
    @Import(name="snapshotSchedule")
    private @Nullable Output<ShareSnapshotScheduleArgs> snapshotSchedule;

    /**
     * @return A `snapshot_schedule` block as defined below.
     * 
     */
    public Optional<Output<ShareSnapshotScheduleArgs>> snapshotSchedule() {
        return Optional.ofNullable(this.snapshotSchedule);
    }

    /**
     * The terms of the Data Share.
     * 
     */
    @Import(name="terms")
    private @Nullable Output<String> terms;

    /**
     * @return The terms of the Data Share.
     * 
     */
    public Optional<Output<String>> terms() {
        return Optional.ofNullable(this.terms);
    }

    private ShareArgs() {}

    private ShareArgs(ShareArgs $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.kind = $.kind;
        this.name = $.name;
        this.snapshotSchedule = $.snapshotSchedule;
        this.terms = $.terms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShareArgs $;

        public Builder() {
            $ = new ShareArgs();
        }

        public Builder(ShareArgs defaults) {
            $ = new ShareArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description The Data Share&#39;s description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Data Share&#39;s description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param kind The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param snapshotSchedule A `snapshot_schedule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder snapshotSchedule(@Nullable Output<ShareSnapshotScheduleArgs> snapshotSchedule) {
            $.snapshotSchedule = snapshotSchedule;
            return this;
        }

        /**
         * @param snapshotSchedule A `snapshot_schedule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder snapshotSchedule(ShareSnapshotScheduleArgs snapshotSchedule) {
            return snapshotSchedule(Output.of(snapshotSchedule));
        }

        /**
         * @param terms The terms of the Data Share.
         * 
         * @return builder
         * 
         */
        public Builder terms(@Nullable Output<String> terms) {
            $.terms = terms;
            return this;
        }

        /**
         * @param terms The terms of the Data Share.
         * 
         * @return builder
         * 
         */
        public Builder terms(String terms) {
            return terms(Output.of(terms));
        }

        public ShareArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
