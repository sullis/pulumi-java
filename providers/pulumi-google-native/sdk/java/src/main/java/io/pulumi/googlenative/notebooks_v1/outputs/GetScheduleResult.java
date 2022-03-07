// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.notebooks_v1.outputs.ExecutionResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.ExecutionTemplateResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetScheduleResult {
    /**
     * Time the schedule was created.
     * 
     */
    private final String createTime;
    /**
     * Cron-tab formatted schedule by which the job will execute. Format: minute, hour, day of month, month, day of week, e.g. 0 0 * * WED = every Wednesday More examples: https://crontab.guru/examples.html
     * 
     */
    private final String cronSchedule;
    /**
     * A brief description of this environment.
     * 
     */
    private final String description;
    /**
     * Display name used for UI purposes. Name can only contain alphanumeric characters, hyphens '-', and underscores '_'.
     * 
     */
    private final String displayName;
    /**
     * Notebook Execution Template corresponding to this schedule.
     * 
     */
    private final ExecutionTemplateResponse executionTemplate;
    /**
     * The name of this schedule. Format: `projects/{project_id}/locations/{location}/schedules/{schedule_id}`
     * 
     */
    private final String name;
    /**
     * The most recent execution names triggered from this schedule and their corresponding states.
     * 
     */
    private final List<ExecutionResponse> recentExecutions;
    private final String state;
    /**
     * Timezone on which the cron_schedule. The value of this field must be a time zone name from the tz database. TZ Database: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    private final String timeZone;
    /**
     * Time the schedule was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","cronSchedule","description","displayName","executionTemplate","name","recentExecutions","state","timeZone","updateTime"})
    private GetScheduleResult(
        String createTime,
        String cronSchedule,
        String description,
        String displayName,
        ExecutionTemplateResponse executionTemplate,
        String name,
        List<ExecutionResponse> recentExecutions,
        String state,
        String timeZone,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.cronSchedule = Objects.requireNonNull(cronSchedule);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.executionTemplate = Objects.requireNonNull(executionTemplate);
        this.name = Objects.requireNonNull(name);
        this.recentExecutions = Objects.requireNonNull(recentExecutions);
        this.state = Objects.requireNonNull(state);
        this.timeZone = Objects.requireNonNull(timeZone);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Time the schedule was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Cron-tab formatted schedule by which the job will execute. Format: minute, hour, day of month, month, day of week, e.g. 0 0 * * WED = every Wednesday More examples: https://crontab.guru/examples.html
     * 
    */
    public String getCronSchedule() {
        return this.cronSchedule;
    }
    /**
     * A brief description of this environment.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Display name used for UI purposes. Name can only contain alphanumeric characters, hyphens '-', and underscores '_'.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Notebook Execution Template corresponding to this schedule.
     * 
    */
    public ExecutionTemplateResponse getExecutionTemplate() {
        return this.executionTemplate;
    }
    /**
     * The name of this schedule. Format: `projects/{project_id}/locations/{location}/schedules/{schedule_id}`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The most recent execution names triggered from this schedule and their corresponding states.
     * 
    */
    public List<ExecutionResponse> getRecentExecutions() {
        return this.recentExecutions;
    }
    public String getState() {
        return this.state;
    }
    /**
     * Timezone on which the cron_schedule. The value of this field must be a time zone name from the tz database. TZ Database: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
    */
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * Time the schedule was last updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String cronSchedule;
        private String description;
        private String displayName;
        private ExecutionTemplateResponse executionTemplate;
        private String name;
        private List<ExecutionResponse> recentExecutions;
        private String state;
        private String timeZone;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.cronSchedule = defaults.cronSchedule;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.executionTemplate = defaults.executionTemplate;
    	      this.name = defaults.name;
    	      this.recentExecutions = defaults.recentExecutions;
    	      this.state = defaults.state;
    	      this.timeZone = defaults.timeZone;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setCronSchedule(String cronSchedule) {
            this.cronSchedule = Objects.requireNonNull(cronSchedule);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setExecutionTemplate(ExecutionTemplateResponse executionTemplate) {
            this.executionTemplate = Objects.requireNonNull(executionTemplate);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRecentExecutions(List<ExecutionResponse> recentExecutions) {
            this.recentExecutions = Objects.requireNonNull(recentExecutions);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetScheduleResult build() {
            return new GetScheduleResult(createTime, cronSchedule, description, displayName, executionTemplate, name, recentExecutions, state, timeZone, updateTime);
        }
    }
}